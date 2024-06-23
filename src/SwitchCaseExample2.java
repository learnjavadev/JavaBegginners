import java.util.Scanner;

public class SwitchCaseExample2 {

	public static void main(String[] xasfsadf) {
		System.out.println("Please enter name of the day [MON,TUE,WED,THU,FRI,SAT,SUN]");
		Scanner sc = new Scanner(System.in);
		String day =sc.nextLine();
		
		switch(day) {
		default:
			System.out.println("Please enter name of the day [MON,TUE,WED,THU,FRI,SAT,SUN]");
			break;
		case "MON":
			System.out.println("1");
			break;
			
		case "mon":
			System.out.println("1");
			break;
			
		case "TUE":
			System.out.println("2");
			break;
			
		case "WED":
			System.out.println("3");
			break;
			
		case "THU":
			System.out.println("4");
			break;
			
		case "FRI":
			System.out.println("5");
			break;
			
		case "SAT":
			System.out.println("6");
			break;
			
		case "SUN":
			System.out.println("7");
			break;
		}
	}
}
