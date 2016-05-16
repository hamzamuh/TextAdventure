import java.util.Scanner;


public class Parser {

	public Scanner in;
	
	public Parser() {
		in = new Scanner (System.in);
	}
	
	public String getNext() {
		System.out.print("> ");
		return in.nextLine().toLowerCase();
	}
	
	// Purpose: Press enter to progress
	public void firstprogress(){
		
		System.out.print("			* press enter to continue *");
		in.nextLine();
		
	}
	public void progress(){
		in.nextLine();
		
	}
}

