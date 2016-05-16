public class HallwayB extends Room {

	boolean leverflag = false;
	
	@Override
	public void intro() {
		response.progress();
		System.out.println("\nOh geez, this same hallway again?! You thought you were out, but that's clearly not the case. Looking around\n"
						+ "you see everything's the same... Wait, here's something interesting. There are now levers where the giant\n" 
						+ "plaque used to be. The levers are also of the same colors, perhaps they're linked.");
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
			response.progress();
			System.out
					.println("Well that looked fun, you turn your attention back to the levers. You should probably pull one now.\n");
			System.out
					.println("As you reach for the levers, the intercom comes back on,\n" +
							"	'Make your choice carefully, not only your life is on the line.'\n");
			response.progress();
			System.out.println("* Which lever do you choose? *");
			String res = response.getNext();
			while(!leverflag) {
				if (res.equals("red") || res.equals("green")) {
					System.out.println("Blow up");
				} else if (res.equals("blue")) {
					System.out.println("The door opens and you go forward as your vision fades to black again...\n");
					roomunlock = true;
					leverflag = true;
					response.progress();
				} else {
					System.out.println("* That is not one of the colors, please enter a color *");
				}
			}
			break;
		case "door":
			System.out.println("The door won't move, there must be a way to get through.");
			
		}

	}

	@Override
	public void lookCommand(String[] cmd) {
		if (cmd[1].equals("at")) {
			switch (cmd[2]) {
			case "door":
				System.out
						.println("There are multiple doors, many seem to be shut with no lock or handle visible.");
				System.out
						.println("Maybe the inconspicuous red, blue, and green levers will be of interest.");
				break;
			case "levers":
				System.out
						.println("There are three levers in front of you: red, blue, and green.");
				break;
			}
		}
	}

	public Room nextRoom() {
		return new HallwayARevisit();
	}
}
