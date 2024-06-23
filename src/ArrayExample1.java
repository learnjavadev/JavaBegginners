public class ArrayExample1 {

	public static void main(String[] arr) {
		
		String[] strArr = new String[3];
		
		strArr[0] = "JAVA";
		strArr[1] = "C";
		strArr[2] = "python";
		
		System.out.println(strArr[2]);
		System.out.println(strArr[1]);
		System.out.println(strArr[0]);
		
//		System.out.println("The length of an array is="+strArr.length);
		System.out.println("The length of an array is="+arr.length);
		
		// array declaration 
		Person[] arrayOfPerson = new Person[2];
		
		// object creation
		Person person1 = new Person();
		Person person2 = new Person();
		
		person1.name = "abdulhamid";
		person2.name = "umar";
		
		
		arrayOfPerson[0] = person2;
		arrayOfPerson[1] = person1;
		
		System.out.println(arrayOfPerson[0].name);
		System.out.println(arrayOfPerson[1].name);
		
		
		
		
		
	}
}
