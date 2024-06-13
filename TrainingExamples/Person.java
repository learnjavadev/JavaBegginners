
public class Person {

	// characteristics / states / fields
	String name; // "Abdulhamid"
	int age; // 32
	int height;
	int contactNumber;
	
	
	// behaviors / method / function
	public void walk() {
		System.out.println("I can walk!");
		// statement 2
		// ....
	}
	
	public void printPersonDetails() {
		System.out.println("Name of the person is="+name);
		System.out.println("Age of the person is="+age);
	}
	
	public static void staticFunction() {
		System.out.println("This is static function");
	}
}
