public class Hallway extends Room {

	@Override
	public void intro() {
		System.out.println("We are now in the hallway of doom");
	}

	public void lookCommand(String[] cmd) {
		if (cmd[1].equals("at")) {
			switch (cmd[2]) {
			case "door":
				System.out
						.println("There are multiple doors, many seem to be shut with no lock or handle visible");
				System.out
						.println("Maybe the inconspicuous red, white, and blue levers will be of interest");
				break;
			case "lever":
				System.out
						.println("You notice a plaque above the levers. It reads,\n"
								+ "	'There are three levers; two lie while one is true. Choose carefully'\n"
								+ "The levers are red, blue, and green. Which one would you like to look at? ");
				String res = response.getNext();
				if (res.equals("red")) {
					System.out.println("Choose me, I am never wrong.");
				} else if (res.equals("blue")) {
					System.out.println("Red lies, I am the right choice.");
				} else if (res.equals("green")) {
					System.out.println("Blue is the liar, you must choose me!");
				}
				else {
					System.out.println("That is not one of the levers.");
				}
			}
		}
	}
}
