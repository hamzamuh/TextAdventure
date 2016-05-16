public abstract class Room {
	// Cell (initial)
	// Kitchen
	// Bedroom
	// Doctors office
	// Final room

	Parser response;
	boolean pickUp = false;
	boolean itemflag = false;
	
	// Rooms Visited Toggles
	boolean cellflag = false;
	boolean cellBflag = false;
	boolean hallwayflag = false;
	
	boolean playflag = true;
	
	// Rooms Unlocked Toggles
	boolean roomunlock;

	public Room() {
		roomunlock = false;
		response = new Parser();
	}

	public Room nextRoom() {
		return null;
}

	/** 
	 * Method: commandRead
	 * 
	 * Purpose: Interprets and checks for proper user input
	 * 
	 * Result: Calls respective command for that specific room
	 * 
	 */
	public void commandRead(String command) {

		String splitCommand[] = command.split(" ");

		switch (splitCommand[0]) {

		case "wait":
			waitCommand(splitCommand);
			break;
		case "pick":
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
			if (splitCommand.length == 1) {
				System.out.println("What do you want to use?");
			}
			else if (splitCommand.length == 2) {
			useCommand(splitCommand);
			}
			else {
				System.out.println("I don't know what you're trying to use");
			}
			break;
		case "attack":
			System.out
					.println("*Professor Oaksera always said: There is a time and place for everything*");
			System.out
					.println("If you listened, maybe you wouldn't have a broken hand right now");
			break;
		case "talk":
			System.out.println("There is no one around to talk to.");
			break;
		case "look":
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
		case "\n":
			System.out.println("* Please enter a command *");
			break;
		default:
			System.out.println("* You cannot do that *");
			break;
		}
			
	}

	
	/**
	 * Method: intro
	 * 
	 * Purpose: Gives introductory message to the room
	 * 
	 * Result: None
	 */
	public void intro() {
		System.out.println("do nothing");
	}

	/**
	 * Method: waitCommand
	 * 
	 * Purpose: Gives notice that the user waits
	 * 
	 * Result: None
	 */
	public void waitCommand(String[] cmd) {
		System.out.println("Time passes but nothing happens.");
	}

	
	/**
	 * Method: pickCommand
	 * 
	 * Purpose: Picks an item up and enters it into the inventory if the room allows
	 * 
	 * Result: Item is added to Inventory
	 */
	public String pickCommand(String[] cmd) {
		System.out.println("There is nothing to pick up");
		return null;
	}

	/**
	 * Method: useCommand
	 * 
	 * Purpose: Makes use of object in room or inventory
	 * 
	 * Result: Return action resulting from using that object
	 */
	public void useCommand(String[] cmd) {
		System.out.println("Don't use that!");
	}

	/**
	 * Method: lookCommand
	 * 
	 * Purpose: Directs attention to area in the room and gives description
	 * 
	 * Result: None
	 */
	public void lookCommand(String[] cmd) {
		System.out.println("Look at that!");
	}
}
