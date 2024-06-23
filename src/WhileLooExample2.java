import java.util.Scanner;

public class WhileLooExample2 {

	public static void main(String[] args) {
		
		System.out.println("Multiplication table example");
		System.out.println("Please enter number");
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		int multiplier = 1;
		
		while(multiplier<=10) {
			System.out.println(number+ " X " + multiplier + " = "+(number*multiplier));
			multiplier++;
		}
		
		System.out.println("End of the program");
	}

}
