public abstract class Room {
	// Cell (initial)
	// Kitchen
	// Bedroom
	// Doctors office
	// Final room
	boolean cellflag;
	boolean unlock;
	Parser response;

	public Room() {
		cellflag = false;
		unlock = false;
		response = new Parser();
	}

	public Room nextRoom() {
		return new Cell();
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
			break;
		case "use":
			System.out.println("use");
			useCommand(splitCommand);
			break;
		case "attack":
			System.out
					.println("Professor Oak always said: There is a time and place for everything");
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
			if (splitCommand[1].equals("at")) {
				lookCommand(splitCommand);
			} else {
				System.out.println("Generally you want to look AT something");
				break;
			}
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

	public void pickCommand(String[] cmd) {
		System.out.println("There is nothing to pick up");
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
