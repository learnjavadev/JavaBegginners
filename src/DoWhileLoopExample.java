import java.util.Scanner;

public class DoWhileLoopExample {

	public static void main(String[] args) {
		
		System.out.println("Enter 3 numbers:");
		
		Scanner sc = new Scanner(System.in);
		
		int index = 0;
		int[] numberArray = new int[3];
		
		
		do {
			numberArray[index] =  sc.nextInt();
			index = index +1;
		}while(index!=3);
		
		System.out.println("End of the program");
	}
}
