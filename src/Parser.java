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
	public void progress(){
		//String enter;
		//boolean progress = false;
		//enter = 
		System.out.println("Press the enter key to continue");
		in.nextLine();
		//while(enter != " "){
			//if(in.hasNext()){in.next();}
			//else{progress = true;}
		//}
	}
}

