public class Cell extends Room {

	public Cell() {

	}

	public void intro() {
		if (!cellflag) {
			System.out.println("Welcome to the cell, good luck!");
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
						.println("The door looks strong and stable, however you notice a padlock on it");
				break;
			case "clock":
				System.out
						.println("You notice that the clock is stuck at 3:04");
				break;
			case "padlock":
				System.out
						.println("It seems to be a 3 digit dial - currenly reads 123 (Obviously not the right combo)");
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
			System.out
					.println("Sleeping your sorrows away won't get you anywhere");
			break;
		case "sink":
			System.out
					.println("Well, I suppose fatal infection is another way to go");
			break;
		case "door":
				System.out.println("The door won't budge, try unlocking first");
			break;
		case "clock":
			System.out.println("It's too high for your tiny ass to reach");
			break;
		case "padlock":
			System.out
					.println("I see you have a combination in mind, what do you think it is? ");
			if (response.getNext().equals("304")) {
				unlock = true;
				System.out.println("The door opens, you seem to be in a hallway now. The door also mysteriously shuts behind you");
			} else {
				System.out.println("The locks seems to have no change");
			}
		}
	}
	
	@Override
	public Room nextRoom() {
		return new Hallway();
	}
}
