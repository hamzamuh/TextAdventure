public class Kitchen extends Room {
	@Override
	public void intro() {
		System.out
				.println("You enter what appears to be a kitchen. To your right, you see an empty cafeteria. A door blocks the path into the cafeteria.\n"
						+ "Within the kitchen, you see an oven, a cutting table, and a large refrigerator. \n"
						+ "isolating... but you don't feel alone. The wall opposite you has another door chained shut. A lock holds the chain in place.");
	}

	@Override
	public void useCommand(String[] cmd) {
		switch (cmd[1]) {
		case "tables":
			System.out
					.println("The tables are strewn around the room, but you're able to move around freely. There's nothing on the tables.");
			break;
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
					.println("There is a inside the oven, but nothing else of note.");
			break;
		case "refrigerator":
			System.out
					.println("In the refrigerator, you see a loaf of bread and an egg carton. However, the egg carton only has one egg in it.");

		}
	}

	@Override
	public String pickCommand(String[] cmd) {
		String ret = "";
		switch (cmd[2]) {
		case "egg":
			ret = cmd[2];
			pickUp = true;
			break;
		}
		return ret;
	}

}