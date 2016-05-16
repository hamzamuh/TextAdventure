import java.util.ArrayList;

public class Inventory {

	ArrayList<String> inventory;
	String res;
	Parser response;
	
	boolean keycardflag;

	public Inventory() {
		inventory = new ArrayList<String>();
		response = new Parser();
		keycardflag = false;
	}

	
	/** 
	 * Method: useItem
	 * 
	 * Purpose: Uses items that exist within inventory
	 * 
	 * Result: Returns action for respective rooms (usually leading to the nextRoom() command)
	 * 
	 */
	public int useItem(String[] item) {

		if (inventory.contains(item[1])) {
			System.out.println("You used the " + item[1]);
			switch (item[1]) {
			case "egg":
				System.out.println("You break the egg open and find an a key within. You take the key to the door and unlock the chains. The chains\n" +
						"away and you open the door to proceed...");
				keycardflag = true;
				return 1;
			case "scalpel":
				System.out.println("* What do you use the scalpel on? *");
				res = response.getNext();
				if (res.equals("body")) {
					System.out
							.println("You take the scalpel to the body. This was never your forte, but you have a feeling\n"
									+ "this will help you. You make an incision over the chest where the heart would be. The opening reveals an\n"
									+ "empty cavity, and within you find a room keycard. You pick it up and go straight to the door. Once you\n"
									+ "swipe the card, the door slides open...\n");
					keycardflag = true;
					return 1;
				} else {
					System.out.println("That doesn't seem to do a lot of good");
					return 1;
				}
			}
		} else {
			System.out.println("You look in your pockets but you can't seem to find it");
			return 0;
		}
		return 0;
	}
}
