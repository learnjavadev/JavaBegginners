
public class Game {

	// A class is blueprint to create an object.
	// A class contains states[fields] and behaviors[methods]

	// states -> fields
	int numberOfPlayers;
	String mode;
	
	// behaviors -> method/function
	void startAGame() {
		System.out.println("Loading...wait");
	}
	
	void winAGame() {
		System.out.println("Winning a game");
	}
	
	void endAGame() {
		System.out.println("Ending game.......");
	}
	
	
	public static void main(String[] args) {
		System.out.println("This is a gaming program!");
		
		Game abcd = new Game();
		abcd.startAGame();
		abcd.winAGame();
		abcd.endAGame();
		
		System.out.println("Thank you! bye");
		abcd.anotherFunction();
	}
	
	void anotherFunction() {
		System.out.println("This is another function");
	}
}
