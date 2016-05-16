public class Hallway extends Room {
	boolean checkflag = false;

	@Override
	public void intro() {
		System.out
				.println("You find yourself in a rather small, confined hallway with many doors. Most of the doors seem to lead to cells like the\n" +
						"one you were just in. However, one door seems unique. On its side is another terminal glowing blankly. On the other side\n" +
						"of the door is a plaque with writing. Perhaps this may be easy to get out of.");
	}

	@Override
	public void useCommand(String[] cmd) {
		switch (cmd[1]) {
		case "terminal":
			if (!checkflag) {
				System.out
						.println("Let's not be hasty, perhaps take a look around.");
			} else {
				System.out
						.println("You approach this terminal as well, you're about to punch in what you think is the answer\n"
								+ "however all you see is a bright light. It blinds you, suddenly you fall through the floor..."
								+ "or at least it feels like it");
				roomunlock = true;
			}
			break;
		case "plaque":
			System.out.println("It's fixed to the wall, there's no point trying to mess with it.");
			break;
		case "door":
			System.out.println("No dice, it's definitely locked. There must be a clue around here somewhere.");
			break;
		default:
			System.out.println("You can't use that.");
		}

	}

	@Override
	public void lookCommand(String[] cmd) {
		if (cmd[1].equals("at")) {
			switch (cmd[2]) {
			case "doors":
				System.out
						.println("There are multiple doors, many seem to be shut with no lock or handle visible");
				break;
			case "door":
				System.out.println("The door stands at the end of the hallway. It's larger than the others, but it's just as firmly locked.");
				System.out.println("Maybe the giant plaque will be of interest");
				break;
			case "plaque":
				System.out.println("You walk towards the plaque. The top reads:\n" +
						"	'Be wary of what you trust. One will be truthful, the others will deceive you.'\n" +
						"It subdivides into 3 sections after that: red, blue, green");
				System.out.println("	'Red: Choose me, I am never wrong.'");
				System.out.println("	'Blue: Red lies, I am the right choice.'");
				System.out.println("	'Green: Blue is the liar, you must choose me!'");
				checkflag = true;
				break;
			case "terminal":
				System.out.println("The terminal doesn't show anything on the screen save for '> '. The keyboard appears normal.");
				break;
			}
		}
	}

	@Override
	public Room nextRoom() {
		return new HallwayB();

	}

}
