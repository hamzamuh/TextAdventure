public class Kitchen extends Room {
	@Override
	public void intro() {
		System.out
				.println("You enter what appears to be a kitchen. To your right, you see an empty cafeteria. A door blocks the path into the cafeteria.\n"
						+ "Within the kitchen, you see an oven, a cutting table, and a large refrigerator. \n"
						+ "Isolating... but you don't feel alone. The wall opposite you has another door chained shut. A lock holds the chain in place.");
	}

	@Override
	public void useCommand(String[] cmd) {
		switch (cmd[1]) {
		case "tables":
			System.out
					.println("The tables are strewn around the room, but you're able to move around freely. There's nothing on the tables.");
			break;
		case "door":
			System.out
					.println("You push and push and push and then plant your feet on the wall and pull the chains until your fingers cramp up\n"
							+ "Maybe if you thought a little, you could find a better solution to this  ");
			break;
		default:
			System.out
					.println("As Professor Oaksera always says; There is a time and place for everything");
		}
	}

	@Override
	public void lookCommand(String[] cmd) {
		switch (cmd[2]) {
		case "door":
			System.out.println("It's locked by the chain, you can't open it.");
			break;
		case "table":
			System.out
					.println("There is a fruit knife and orange sitting on a cutting board on top of the table. Otherwise, the table is remarkably clean.");
			break;
		case "cafeteria":
			System.out.println("The cafeteria is completely empty.");
			break;
		case "oven":
			System.out
					.println("There is a pan of mac and cheese inside the oven, but nothing else of note. Luckily you're not hungry.");
			break;
		case "refrigerator":
			System.out
					.println("In the refrigerator, you see a loaf of bread and an egg carton. However, the egg carton only has one egg in it. Nothing interesting.\n" +
							"You are shutting the door when you notice a note hanging inside the door. It reads,\n" +
							"	'I can be stolen or given away, yet you will live.\n" +
							"	 I can be replaced, but without me you cannot live.'");
			System.out.println("From somewhere in the cafeteria, the echoing voice of the intercom rings out,\n" +
					"	'Time is running out, be quick! Your lives depend on it.'\n" +
					"As the voice fades, you feel the familiar sensation again as light fades and you fall through the floor into darkness.");
			roomunlock = true;
			break;

		default:
			System.out
					.println("That doesn't seem to be anywhere in visible sight");
		}
	}

	@Override
	public String pickCommand(String[] cmd) {
		String ret = "";
		switch (cmd[2]) {
		case "egg":
		case "knife":
			ret = cmd[2];
			pickUp = true;
			break;
		}
		return ret;
	}

	@Override
	public Room nextRoom() {
		return new Infirmary();
	}

}