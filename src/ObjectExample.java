
public class ObjectExample {

	public static void main(String[] arf) {
		
		Person person1 = new Person(); // object creation in java
		
		person1.name = "umar";
		person1.age = 21;
		
		Person person2 = new Person();
		
		person2.name = "usman";
		person2.age = 20;
		
//		System.out.println("Name of the person is="+person1.name);
//		System.out.println("Age of the person is="+person1.age);
//		
//		System.out.println("Name of the person is="+person2.name);
//		System.out.println("Age of the person is="+person2.age);
		
		person1.printPersonDetails();
		person2.printPersonDetails();
		
		
		
		Person.staticFunction(); // static call
		
		
	}
}
