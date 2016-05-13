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
		Room currentRoom = new Cell();
		
		Room cellA = new Cell();
		//Room hallwayA = new Hallway();
		//Room kitchenA = new Kitchen();
		//Room guardTowerA = new GuardTower();
		//Room wardensA = new Wardens();
		
		Room cellB = new CellB();
		//Room hallwayB = new HallwayB();
		//Room infirmary = new Infirmary();
		
		while (play) {
			currentRoom.intro();
			while ((!currentRoom.cellunlock) && (!currentRoom.swap)) {
				System.out.println("\n" + counter++ + "	=================================================");
				currentRoom.commandRead(parser.getNext());
			}
			switch(currentRoom.nextRoom()) {
				case (0):
					currentRoom = cellB;
					break;
				/*case (1):
					currentRoom = hallwayA;
				}*/
			}

		}
	}
}
