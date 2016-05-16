public class KitchenRevisit extends Room {

	@Override
	public void intro() {
		System.out
				.println("You grab the key, and the ground starts shaking, it feels like an earthquake. Using your minimal survival skills, you lay on \n"
						+ "the ground. Suddenly, everything is still again. You stand up and you look around");

		response.progress();

		System.out
				.println("You enter what appears to be a kitchen. To your right, you see an empty cafeteria. A door blocks the path into "
						+ "the cafeteria.\n"
						+ "Within the kitchen, you see an oven, a cutting table, and a large ... wait a second\n"
						+ "This is the same kitchen as before! The door is still chained shut! Maybe we can open it now");
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
		case "egg":
			itemflag = true;
			break;
		default:
			itemflag = true;
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
			System.out.println("You grab the egg out of the refrigerator.");
		case "knife":
			ret = cmd[2];
			pickUp = true;
			break;
		}
		return ret;
	}

	@Override
	public Room nextRoom() {
		return new WardenOffice();
	}
}
