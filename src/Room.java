public abstract class Room {
	// Cell (initial)
	// Kitchen
	// Bedroom
	// Doctors office
	// Final room

	Parser response;
	boolean pickUp = false;
	
	// Rooms Visited Toggles
	boolean cellflag = false;
	boolean cellBflag = false;
	boolean hallwayflag = false;
	
	// Rooms Unlocked Toggles
	boolean cellunlock;
	boolean cellBunlock;

	public Room() {
		cellunlock = false;
		cellBunlock = false;
		response = new Parser();
	}

	public Room nextRoom() {
		return null;
}

	public void commandRead(String command) {

		String splitCommand[] = command.split(" ");

		switch (splitCommand[0]) {

		case "wait":
			System.out.println("wait");
			waitCommand(splitCommand);
			break;
		case "go":
			System.out.println("go");
			goCommand(splitCommand);
			break;
		case "pick":
			System.out.println("pick");
			if(splitCommand.length == 1) {
				System.out.println("* What do you mean to pick up? *");
			} else {
				if(splitCommand.length == 3 && splitCommand[1].equals("up")) {
					pickCommand(splitCommand);
				} else {
					System.out.println("*Generally you want to try picking something UP*");
				}
			}
			break;
		case "use":
			System.out.println("use");
			useCommand(splitCommand);
			break;
		case "attack":
			System.out
					.println("*Professor Oak always said: There is a time and place for everything*");
			System.out
					.println("If you listened, maybe you wouldn't have a broken hand right now");
			attackCommand(splitCommand);
			break;
		case "talk":
			System.out.println("talk");
			talkCommand(splitCommand);
			break;
		case "look":
			System.out.println("look");
			if(splitCommand.length == 1) {
				System.out.println("* What do you mean to look at? *");
			} else {
				if(splitCommand.length == 3 && splitCommand[1].equals("at")) {
					lookCommand(splitCommand);
				} else {
					System.out.println("*Generally you want to try looking AT something*");
				}
				break;
			}
		// FIX: Want to have blank enter return this prompt //
		case "\n":
			System.out.println("* Please enter a command *");
			break;
		default:
			System.out.println("* You cannot do that *");
			break;
		}
			
	}

	public void intro() {
		System.out.println("do nothing");
	}

	public void waitCommand(String[] cmd) {
		System.out.println("You got wrecked");
	}

	public void goCommand(String[] cmd) {
		System.out.println("You can't go there");
	}

	public String pickCommand(String[] cmd) {
		System.out.println("There is nothing to pick up");
		return null;
	}

	public void useCommand(String[] cmd) {
		System.out.println("Don't use that!");
	}

	public void attackCommand(String[] cmd) {
		System.out.println("You hit a wall, you broke your hand");
	}

	public void talkCommand(String[] cmd) {
		System.out.println("Talking to yourself makes you crazy");
	}

	public void lookCommand(String[] cmd) {
		System.out.println("Look at that!");
	}
}
