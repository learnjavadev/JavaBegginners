
public class DoWhileTableExample {

	public static void main(String[] args) {
		
		System.out.println("Multiplication Table Example");
		
		int number = 2;
		int multiplier = 1;
		
		do {
			int mult = number * multiplier;
			System.out.println(number + " X "+multiplier + " = "+ mult);
			multiplier = multiplier + 1; // multiplier++
		}while(multiplier<=10);
		
	}
}
