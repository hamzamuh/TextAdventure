import java.util.ArrayList;

public class Game {

	private Room location;
	private ArrayList<String> inven = new ArrayList<>();
	private int points = 0;

	private String cmd;

	private static boolean play = true;

	public static void main(String[] args) {

		Parser parser = new Parser();
		Room currentRoom = new Cell();

		while (play) {
			currentRoom.intro();
			while (!(currentRoom.unlock)) {
				currentRoom.commandRead(parser.getNext());
			}
			currentRoom = currentRoom.nextRoom();

		}
	}
}
