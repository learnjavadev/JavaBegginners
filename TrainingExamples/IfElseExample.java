import java.util.Scanner;

public class IfElseExample {

	public static void main(String[] args) {
		
		System.out.println("Please enter number");
		
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		if(number > 0) {
			// print "positive" number > 0
			System.out.println("positive");
		}else {
			if(number < 0)  {
				// print "positive" number > 0
				System.out.println("negative");
			}else {
				System.out.println("zero");
			}

		}
	}
}
