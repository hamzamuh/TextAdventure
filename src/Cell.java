public class Cell extends Room {
	
	boolean writing = false;
	public Cell() {

	}

	public void intro() {
		if (!cellflag) {
			System.out.println(".");
			//response.progress();
			System.out.println("..");
			System.out.println("...");
			System.out.println("");
			System.out.println("You wake from a rough sleep. It only seems fair, the bed you were sleeping on\n"
					+ "is a thin cot on a frame fixed to the wall. Your focus, although very hazy, turns from the\n"
					+ "bed to the room. It's quite dark and cramped. Luckily, you're not claustraphobic. You rise\n"
					+ "from the bed. As your senses slowly return, you realize the room is a jail cell. There is a\n"
					+ "sink on the opposite wall of the bed, writing on the back wall, and a door in the front.");
			cellflag = true;
		}
	}

	public void goCommand(String[] cmd) {

	}

	@Override
	public void lookCommand(String[] cmd) {
		switch (cmd[2]) {
			case "bed":
				System.out
						.println("The bed is messy, pillows flat. You're lucky you got pillows.");
				break;
			case "sink":
				System.out
						.println("You see fungi coming out the sink, you probably don't want to touch that");
				break;
			case "door":
				System.out.println("The door looks strong and stable. There's no breaking out. Looking closer,\n"
								+ "you notice a padlock on the latch.");
				break;
			case "writing":
				System.out.println("Your vision is slightly blurry, but you read,\n"
						+ "	'More powerful than God,\n	More evil than the Devil,\n	The poor have it,\n	The rich need it\n"
						+ "	When eaten, you will die.'");
				writing = true;
				break;
			case "padlock":
				System.out
						.println("It seems to be a 3 digit dial which currenly reads 1-2-3. The padlock remains shut.");
				break;
			default: 
				System.out.println("You look and look and look, but you can't find a " + cmd[2]);
				break;
			}
		}

	@Override
	public void useCommand(String[] cmd) {
		switch (cmd[1]) {
		case "bed":
			System.out.println("Sleeping your sorrows away won't get you anywhere.");
			break;
		case "sink":
			System.out.println("Well, I suppose fatal infection is another way to go.");
			break;
		case "door":
			System.out.println("The door won't budge. It's held in place by the lock.");
			break;
		case "writing":
			System.out.println("The writing seems permanent. You can't do anything to it.");
			break;
		case "padlock":
			if(writing == false){
				System.out.println("You feel like you should check the rest of the room first.");
			} else {
				System.out.print("You approach the padlock. ");
					System.out.println("As you grab the padlock, a voice comes from the back of the room.\n\n"
							+ "	'Welcome to the... Nash Game. The rules are simple. First,\n");
				
							response.progress();
							
							System.out.println("	your goal is to escape. Second, your choices are your and yours alone. What you\n"
							+ "	choose to do with that power is up to you. Good luck.'\n");
							cellunlock = true;
				}
			break;
			}
		}
	
	@Override
	public Room nextRoom() {
		//if(swap && !cellunlock){
		return new CellB();
		
		}
	}

