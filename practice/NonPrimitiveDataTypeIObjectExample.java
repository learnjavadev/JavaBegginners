
public class NonPrimitiveDataTypeIObjectExample {

	public static void main(String[] args) {

		// this is our object data type example
		Employee employee1 = new Employee();
		
		System.out.println(employee1.age);
		System.out.println(employee1.gender);
		
		employee1.age = 25;
		employee1.gender = "male";
		
		System.out.println(employee1.age);
		System.out.println(employee1.gender);
		
		
        Book book1 = new Book();
		
		
		book1.bookName = "someName1";
		book1.noOfPages = 100;
		book1.publisher = "publisher1";
		
		System.out.println("booke name="+book1.bookName);
		System.out.println("no of pages="+book1.noOfPages);
		System.out.println("publisher="+book1.publisher);
		System.out.println("year of publish="+book1.yearOfPublish);

		Person p1 = new Person();
		
		p1.name = "abdulhamid";
		p1.height = 174;
		p1.contactNumber = 123456;
		
		System.out.println("Name of the person is ="+p1.name);
		System.out.println("Height of the person is ="+ p1.height);
		System.out.println("Contact number of the person is ="+p1.contactNumber);

		System.out.println("=================================");
		Person p2 = new Person();
		p2.name = "umar";
		p2.height = 170;
		p2.contactNumber = 87654;
		System.out.println("Name of the person is ="+p2.name);
		System.out.println("Height of the person is ="+ p2.height);
		System.out.println("Contact number of the person is ="+p2.contactNumber);
	}

}
