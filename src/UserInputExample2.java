import java.util.Scanner;

public class UserInputExample2 {

	public static void main(String[] args) {

		// int name
		// int age
		// boolean isAdult;
		
		System.out.println("Please enter person's data:");
		
		System.out.println("Please enter name:");
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		
		System.out.println("Please enter age:");
		int age = sc.nextInt();
		
//		System.out.println("Please enter true if you are an adult:");
//		boolean isAdult = sc.nextBoolean(); // true/false;
		
		System.out.println("========================");
		System.out.println("Entered data is:");
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
//		System.out.println("Is person adult?:"+isAdult);
		
		
		if(age >= 18) {
			System.out.println(name+" is person adult");
		}else {
			System.out.println(name+" is person minor");
		}
		
		
		
	}

}
