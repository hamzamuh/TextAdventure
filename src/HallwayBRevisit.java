
public class HallwayBRevisit extends Room {
	
	@Override
	public void intro() {
		System.out.println("you find yourself back in a hallway. Perhaps it's a new one, you can hope at least.\n" +
				"But you notice the terminal that you first tried to use. You realize it's the same room.");
	}
	@Override
	public void useCommand(String[] cmd) {
		switch (cmd[1]) {
		case "terminal":
			System.out.println("You approach the levers, but you notice something on the ceiling above the levers");
			System.out.println("It reads: \n" +
					"	This thing all things devours\n" +
					"	Birds, beasts, trees, flowers\n" +
					"	Gnaws iron, bites steel\n" +
					"	Grinds hard stones to meal\n" +
					"	Slays king, ruins town\n" + 
					"	And beats high mountain down.\n");
			System.out.println("Well that looked fun, you turn your attention back to the levers. You should probably pull one now");
			System.out.println("P.S. Pulling the wrong lever might kill you.... soooo which one is it going to be");
			String res = response.getNext();
			if (res.equals("red") || res.equals("green")) {
				System.out.println("Blow up");
			}
			else if (res.equals("blue")) {
				cellunlock = true;
			}
				else {
					System.out.println("That's not an option, colorblind little shit");
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
		return new Kitchen();
	}

}
