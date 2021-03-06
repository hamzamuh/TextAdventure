import java.util.ArrayList;

public class Game {

	private Room location;
	private ArrayList<String> inven = new ArrayList<>();
	private int points = 0;

	private static int counter = 001;

	private String cmd;

	private static boolean play = true;

	public static void main(String[] args) {

		Parser parser = new Parser();
		Inventory items = new Inventory();
		Room currentRoom = new Cell();

		Room cellA = new Cell();
		Room hallwayA = new Hallway();
		Room kitchenA = new Kitchen();
		Room cellB = new CellB();
		// Room hallwayB = new HallwayB();
		// Room infirmary = new Infirmary();
		String next;
		String[] command;
		while (play) {
			currentRoom.intro();
			while ((!currentRoom.roomunlock)) {
				System.out.println("\n" + counter++
						+ "	=================================================");
				next = parser.getNext().toLowerCase();
				currentRoom.commandRead(next);
				if (currentRoom.pickUp) {
					command = next.split(" ", 3);
					items.inventory.add(currentRoom.pickCommand(command));
					currentRoom.pickUp = false;
					System.out.println("Inventory: " + items.inventory.get(0));
				}
				if (currentRoom.itemflag) {
					command = next.split(" ", 2);
					items.useItem(command);
					currentRoom.itemflag = false;
					if (items.keycardflag) {
						currentRoom.roomunlock = true;
					}
					items.keycardflag = false;
				}
				if (!currentRoom.playflag) {
					System.exit(0);
					
				}
				else {System.out.println("No"); }
			}
			currentRoom = currentRoom.nextRoom();
			/*
			 * switch(currentRoom.nextRoom()) { case (0): currentRoom = cellB;
			 * break; case (1): currentRoom = hallwayA; break; case(2): } }
			 * 
			 * }( (
			 */

		}
		System.out.println("Exit While Loop");
	}
}
