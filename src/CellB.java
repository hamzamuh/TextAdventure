public class CellB extends Room {
	
	boolean clock = false;
	public CellB() {
		cellflag = true;
	}

	public void intro() {
		if (!cellBflag) {
			System.out.println("...");
			//response.progress();
			System.out.println("'welcome...'");
			System.out.println("...");
			System.out.print("'...to escape...'");
			System.out.println("...");
			System.out.println("'...good luck'\n");
			System.out.println("You wake from a rough sleep. It only seems fair, the bed you were sleeping on\n"
					+ "is a thin cot on a frame fixed to the wall. Your focus, although very hazy, turns from the\n"
					+ "bed to the room. It's quite dark and... cramped...\n");
			System.out.println("...\n");
			//response.progress
			System.out.println("The feeling of deja vu rushes over you. Suddenly, you begin to panic. The room\n"
					+ "is incredibly small. The darkness doesn't help either. How did you get here? You know better\n"
					+ "than to be in places like this. Your chest contracts from the breathing and you fall to the\n"
					+ "ground. The fear begins to overwhelm you.");
			System.out.println("But some feeling in the back of your mind steels you. You concentrate and breathe. With suprising\n"
					+ "clarity, you get up.");
			cellBflag = true;
			System.out.println("The room seems to be just as you remember it. But looking back, you now see a clock on the wall.\n"
					+ "The door no longer has a padlock, but now there's a small terminal glowing dimly on the wall next\n"
					+ "to the door.");
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
				System.out.println("The door looks sturdy. It's very much locked.");
				break;
			case "clock":
				System.out.println("Your sense of time is just as blurry as your senses, but the clock reads 3:04.\n"
						+ "Whether that means PM or AM, you can't be sure. But the clock seems to be frozen.");
				clock = true;
				break;
			case "terminal":
				System.out.println("The terminal doesn't show anything on the screen save for '> '. The keyboard\n"
						+ "appears normal.");
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
		case "clock":
			System.out.println("The clock is frozen and fixed to the wall. No luck.");
			break;
		case "terminal":
			if(clock == false){
				System.out.println("You feel like you should check the rest of the room first.");
			} else {
			System.out.print("You approach the terminal and attempt an answer on the keyboard:\n	'> ");
				if (response.in.nextLine().equals("nothing")) {
					cellunlock = true;
					System.out.println("The door opens, you seem to be in a hallway now. The door also mysteriously shuts behind you");
				} else {System.out.println("The entry seems to have no effect");}
				break;
			}
		}
	}
	
	@Override
	public Room nextRoom() {return new CellARevisit();}
	
}
