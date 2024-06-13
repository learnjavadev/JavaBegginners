
public class Employee {

	// attributes / states / class-variables

	int age; // 7 
	String gender; // male/female
	String qualifications;
	double salary; // 23451.213423
	double experience; // 2.4 

	// method
	public void arriveOnTime() {

	}

	// method
	public void doWork() {
		System.out.println("I am doing work!");
		age = 32;
		gender = "male";

	}

	// method
	public void takeABreak() {

	}

	public static void main(String[] abc) {

		Employee e1 = new Employee();
		 Person p1 = new Person();
		
		System.out.println("This is employee management program!");
		e1.doWork();
	}
}
