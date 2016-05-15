import java.util.ArrayList;

public class Inventory {

	ArrayList<String> inventory;

	public Inventory() {
		inventory = new ArrayList<String>();
	}
	
	public void insert (String item) {
		inventory.add(item);
	}

}