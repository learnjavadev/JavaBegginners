import java.util.Scanner;

public class ScannerClassExmaple {

	public static void main(String[] args) {

		System.out.println("Enter two numbers: ");
		System.out.println("Enter first number :");
		Scanner sc = new Scanner(System.in);

		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		System.out.println("***************************");
		System.out.println(" First Number is = " + number1);
		System.out.println("Second number is = " + number2);

	}
	
}
