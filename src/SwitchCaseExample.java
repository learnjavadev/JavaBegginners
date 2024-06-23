import java.util.Scanner;

public class SwitchCaseExample {

	public static void main(String[] ards) {
		System.out.println("Switch case example");
		System.out.println("Please enter the number for the day for the week");

		Scanner sc = new Scanner(System.in);
		int dayOfTheWeek = sc.nextInt();
		
		switch(dayOfTheWeek) {
		
		case 1: 
			System.out.println("this is monday");
//			break;
				
		case 2: 
			System.out.println("this is tuesday");
//			break;
			
		case 3: 
			System.out.println("this is wednesday");
//			break;
			
		case 4: 
			System.out.println("this is thursday");
//			break;
			
		case 5: 
			System.out.println("this is friday");
//			break;
			
		case 6: 
			System.out.println("this is satruday");
//			break;
			
		 default:
			System.out.println("Please enter number from 1 to 7");
			break;
			
		case 7: 
			System.out.println("this is sunday");
//			break;
		}
		System.out.println("end of the program");
	}
}
