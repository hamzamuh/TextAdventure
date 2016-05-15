public class CellARevisit extends Room {

	public CellARevisit() {

	}

	public void intro() {
		if (!cellflag) {
			System.out.println(".");
			// response.progress();
			System.out.println("..");
			System.out.println("...");
			System.out.println("");
			System.out
					.println("You seem to find yourself back in the room with writing and the padlock on the door. What a strange out body experience,\n"
							+ "but you know that you're awake now. You pinch yourself just to be sure.");
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
			System.out
					.println("The door looks strong and stable. There's no breaking out. Looking closer,\n"
							+ "you notice a padlock on the latch.");
			break;
		case "writing":
			System.out
					.println("Your vision is slightly blurry, but you read,\n"
							+ "	'More powerful than God,\n	More evil than the Devil,\n	The poor have it,\n	The rich need it\n"
							+ "	When eaten, you will die.'");
			break;
		case "padlock":
			System.out
					.println("It seems to be a 3 digit dial which currenly reads 1-2-3. The padlock remains shut.");
			break;
		default:
			System.out
					.println("You look and look and look, but you can't find a "
							+ cmd[2]);
			break;
		}
	}

	@Override
	public void useCommand(String[] cmd) {
		switch (cmd[1]) {
		case "bed":
			System.out
					.println("Sleeping your sorrows away won't get you anywhere.");
			break;
		case "sink":
			System.out
					.println("Well, I suppose fatal infection is another way to go.");
			break;
		case "door":
			System.out
					.println("The door won't budge. It's held in place by the lock.");
			break;
		case "writing":
			System.out
					.println("The writing seems permanent. You can't do anything to it.");
			break;
		case "padlock":

			System.out
					.print("You approach the padlock and attempt a combination: ");
			if (response.in.nextLine().equals("304")) {
				cellunlock = true;
				System.out
						.println("The door opens, you seem to be in a hallway now. The door also mysteriously shuts behind you.");
			} else {
				System.out.println("The combination doesn't seem to work.");
			}
			break;
		}

	}

	@Override
	public Room nextRoom() {
		// if(swap && !cellunlock){
		return new Hallway();

	}
}
