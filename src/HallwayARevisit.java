
public class HallwayARevisit extends Room {
	
	@Override
	public void intro() {
		System.out.println("\n...You find yourself back in the previous hallway. Perhaps it's a new one, you can hope at least.\n" +
				"You turn and notice the terminal that you first tried to use. You realize it's the same room as before the levers.");
	}
	@Override
	public void useCommand(String[] cmd) {
		switch (cmd[1]) {
		case "terminal":
			System.out.println("You approach the terminal, clutching the screen just in case the ground falls out from\n" +
					"under you again. Certain you're steady, you attempt an answer on the keyboard:\n	'> ");
				if (response.in.nextLine().equals("time")) {
					roomunlock = true;
					System.out.println("The door opens and you enter (It's not as though there's any other path to take). The door" +
							"shuts behind you once again.\n");
				} else {System.out.println("The entry seems to have no effect");}
				break;
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
			case "terminal":
				System.out.println("The terminal doesn't show anything on the screen save for '> '. The keyboard appears normal.");
				break;
			case "plaque":
				System.out.println("You walk towards the plaque. The top reads:\n" +
						"	'Be wary of what you trust. One will be truthful, the others will deceive you.'\n" +
						"It subdivides into 3 sections after that: red, blue, green");
				System.out.println("	'Red: Choose me, I am never wrong.'");
				System.out.println("	'Blue: Red lies, I am the right choice.'");
				System.out.println("	'Green: Blue is the liar, you must choose me!'");
				
				System.out.println("Of course, now it seems obvious it was blue.");
				break;
			case "door":
				System.out.println("The door stands at the end of the hallway. It's larger than the others, but it's just as firmly locked.");
				break;
			}
		}
	}
	public Room nextRoom() {
		return new Kitchen();
	}

}
