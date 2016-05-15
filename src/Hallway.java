public class Hallway extends Room {
	boolean checkflag = false;

	@Override
	public void intro() {
		System.out
				.println("We are now in a rather small, confined hallway with many doors. Perhaps this may be easy to get out of");
	}

	@Override
	public void useCommand(String[] cmd) {
		switch (cmd[1]) {
		case "terminal":
			if (!checkflag) {
				System.out
						.println("Let's not be hasty, perhaps take a look around");
			} else {
				System.out
						.println("You approach this terminal as well, you're about to punch in what you think is the answer\n"
								+ "however all you see is a bright light. It blinds you, suddenly you fall through the floor, or at least it\n"
								+ "feels like it");
				cellunlock = true;
			}
			break;
		}

	}

	@Override
	public void lookCommand(String[] cmd) {
		if (cmd[1].equals("at")) {
			switch (cmd[2]) {
			case "door":
				System.out
						.println("There are multiple doors, many seem to be shut with no lock or handle visible");
				System.out
						.println("Maybe the giant plaque will be of interest");
				break;
			case "plaque":
				System.out
						.println("You walk towards the plaque. It subdivides into 3 sections; red, blue, green");

				System.out.println("Red: Choose me, I am never wrong.");
				System.out.println("Blue: Red lies, I am the right choice.");
				System.out
						.println("Green: Blue is the liar, you must choose me!");
				checkflag = true;
			}
		}
	}

	@Override
	public Room nextRoom() {
		return new HallwayB();

	}

}
