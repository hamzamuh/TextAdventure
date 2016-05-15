public class HallwayB extends Room {

	@Override
	public void intro() {
		System.out
				.println("Oh geez, this same hallway again?! You thought you were out, but clearly not the case. Looking around\n"
						+ "you see much of the same thing. But here's something interesting there are now levers where the giant plaque used to be\n"
						+ "The levers are also of the same colors, perhaps they're linked.");
	}

	@Override
	public void useCommand(String[] cmd) {
		switch (cmd[1]) {
		case "levers":
			System.out
					.println("You approach the levers, but you notice something on the ceiling above the levers");
			System.out.println("It reads: \n"
					+ "	This thing all things devours\n"
					+ "	Birds, beasts, trees, flowers\n"
					+ "	Gnaws iron, bites steel\n"
					+ "	Grinds hard stones to meal\n"
					+ "	Slays king, ruins town\n"
					+ "	And beats high mountain down.\n");
			System.out
					.println("Well that looked fun, you turn your attention back to the levers. You should probably pull one now");
			System.out
					.println("P.S. Pulling the wrong lever might kill you.... soooo which one is it going to be");
			String res = response.getNext();
			if (res.equals("red") || res.equals("green")) {
				System.out.println("Blow up");
			} else if (res.equals("blue")) {
				cellunlock = true;
			} else {
				System.out
						.println("That's not an option, colorblind little shit");
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
						.println("Maybe the inconspicuous red, white, and blue levers will be of interest");
				break;
			case "levers":
				System.out
						.println("You notice a smaller plaque above the levers. It reads,\n"
								+ "	'There are three levers; two lie while one is true. Choose carefully'\n"
								+ "The levers are red, blue, and green.");
				break;
			}
		}
	}

	public Room nextRoom() {
		return new HallwayBRevisit();
	}
}
