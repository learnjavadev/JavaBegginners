import java.util.Scanner;

public class DoWhilePasswordCheckExample {

	public static void main(String[] args) {

		String correctPassword = "admin";
		String input = null;
		System.out.println("Please enter your password to login");
		
		Scanner sc = new Scanner(System.in);
		
		do {
			input  = sc.next();

			if(!input.equalsIgnoreCase(correctPassword)) {
				System.out.println("Password is not correct! Please enter again");
			}
		}while(!input.equalsIgnoreCase(correctPassword));
		
		System.out.println("Entered password is="+input);
		System.out.println("Corect, Successfully logged in");
		
		
	}

}
