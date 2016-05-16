
public class WardenOffice extends Room {
	
	@Override
	public void intro() {
		System.out.println("You enter what looks like a corporate office. When you walk into the door, you see somebody standing in the room\n" +
				"opposite of you, banging against a wall");
		System.out.println("As you're banging against the wall hopelessly, you see someone walk into the room");
		System.out.println("You realize that you weren't being transported to different rooms after all, but you saw through each others' eyes");
		System.out.println("You both observe each other and stare with confusion, as you both open your mouths to speak, an intercom buzzes");
		System.out.println("Intercom: Congratulations, you have survived the experiment! You are free to leave as you will");
		System.out.println("Silently, you turn away from each other and walk out....");
		System.out.println("\n\n To be continued...");
		
		System.out.println("\n\n\n * Good job, you completed the Esper Game. You are free to go, you live as you please. This fills you with determination!");
		playflag = false;
	}
}
