import java.util.Scanner;

public class DoWhileLoopExample2 {

	public static void main(String[] args) {

		System.out.println("Please enter multiple names");
		System.out.println("Please enter stop when you are done!");
		
		Scanner sc = new Scanner(System.in);
		String input = null;
		
		do {
			input = sc.next();
			System.out.println("You have entered="+input);
		}while(!"stop".equals(input)); // "stop" != input

		System.out.println("End of the program");
		
//		String str = "stop";
//		System.out.println(str == "stop");
	}
}
