import java.util.Scanner;


public class Parser {

	public Scanner in;
	
	public Parser() {
		in = new Scanner (System.in);
	}
	
	public String getNext() {
		return in.nextLine();
	}
}
