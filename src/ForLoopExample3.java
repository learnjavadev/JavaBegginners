
public class ForLoopExample3 {

	public static void main(String[] args) {
		// multiplication table
		
		int number = 2;
		
		for(int multiplier=1; multiplier<=10 ; multiplier++) {
			int multResult = number * multiplier;
			
			System.out.println(number + " X " + multiplier +" = "+multResult);
		}
		
	}
}
