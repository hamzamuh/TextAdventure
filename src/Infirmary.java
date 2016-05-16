public class Infirmary extends Room {

	boolean lightflag;
boolean keyflag;	
	
	public Infirmary() {
		lightflag = false;
		keyflag = false;
	}

	@Override
	public void intro() {
		if (!lightflag) {
			System.out
					.println("You enter a mysterious room, it's dark.\n"
							+ "You stumble around, trying to look frantically for something that you can grab\n"
							+ "Gah! you cut your hand on a sharp object. Then, being as smart as you are you start feeling the object\n"
							+ "and discover it to be a scalpel. Perhaps we should start with the lights");
		} else {
			System.out
					.println("The lights blind you, and after a solid 5 seconds you open your eyes and look around\n"
							+ "The object that stabbed you was indeed a scalpel. You look around and you notice this to be an infirmary.\n"
							+ "There is a table in the middle of the room with a mannequin. On the far wall, there are cabinets."
							+ "maybe we should try to patch up this wound first with a bandaid");

		}
	}

	@Override
	public void useCommand(String[] cmd) {
		switch (cmd[1]) {
		case "lights":
			if(!lightflag){
				lightflag = true;
				System.out.println("You reach for the switch and find something on the wall near you. You flip it up.");
				intro();
			} 
			else { System.out.println("You don't do well with the darkness, there's no point to turning off the lights anyways."); }
			break;
		case "tables":
			System.out
					.println("Uhh, maybe you shouldn't touch the table with the body on it");
			break;
		case "door":
			System.out
					.println("What door?");
			break;
		case "scalpel":
			itemflag = true;
			break;
		default:
			System.out.println("As Professor Oaksera always says; There is a time and place for everything");
		}
	}

	@Override
	public void lookCommand(String[] cmd) {
		switch (cmd[2]) {
		case "door":
			System.out.println("What door?");
			break;
		case "table":
		case "body":
			System.out
					.println("What? Is that a body? What kind of sick, twisted place is this?? ");
			System.out.println("There's a note in his hand ...");
			response.progress();
			System.out.println("It reads: \n" +
					"	A box without hinges, key, or lid,\n" +
					"	yet golden treasure inside is hid.");
			break;
		case "bandaid":
			System.out
					.println("You find the bandaid hanging from the ceiling by a thread ... ");
		default:
			System.out
					.println("That doesn't seem to be anywhere in visible sight");
		}
	}

	public String pickCommand(String[] cmd) {
		String ret = "";
		switch (cmd[2]) {
		case "scalpel":
			ret = cmd[2];
			pickUp = true;
			break;
		case "bandaid":
			System.out.println("Great, stuff it into your pocket and let the wound bleed out. Try using it instead");
			break;
		default:
			System.out.println("There doesn't seem to be one in the room");
		}
		return ret;
	}

	@Override
	public Room nextRoom() {
		return new KitchenRevisit();
	}
}
