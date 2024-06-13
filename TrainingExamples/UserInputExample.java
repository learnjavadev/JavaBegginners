import java.util.Scanner;

public class UserInputExample {

	public static void main(String[] args) {

		System.out.println("This is example of taking input from the user");
		
		System.out.println("Enter some message:");
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		System.out.println("Input entered:"+input);
		
		System.out.println("Please enter first number:");
		
		Scanner sc = new Scanner(System.in);
		
		int number1 = sc.nextInt();
		System.out.println("First number entered="+number1);
		
	}

}
