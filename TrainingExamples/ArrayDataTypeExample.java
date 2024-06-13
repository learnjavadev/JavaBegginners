
public class ArrayDataTypeExample {

	public static void main(String[] args) {
		
		System.out.println("This is array example program!");
		
		// real time example
		// matrix [1	2	4]
		// [99912,342344345,234234234]
		// [branch1, branch1]
		// roll numbers [1,2,3,4,5,6,7,8]
		// song list [song1,song2,song3....]
		
		// byte -127 to 128 
//		byte num1 = 10;
//		
//		byte[] numArray = {1,2,3,4,5,6,7};
//		
//		numArray[1] = 22;
//		System.out.println(numArray[0]);
//		System.out.println(numArray[1]);
		
		// array declaraion
//		String[] nameArray = {"Abubakar", "Usman", "Umar", "Ali"};
		
//		System.out.println(nameArray[0]);
		
//		for(String name : nameArray) {
//			System.out.println(name);
//		}
		
//		String[] nameArray = new String[4]; // capacity max = 4 string element
//		
//		
//		int[] intArray = new int[8]; // index = n-1
//		
//		intArray[0] = 1;
//		intArray[7] = 8;
//		intArray[4] = 5;
//		
//		nameArray[0] = "abc";
//		
//		System.out.println(intArray[4]);
//		System.out.println(nameArray[0]);
//		
//		
//		long[] arrayOfLongDataType = new long[10];
//		
//		boolean[] arrayOfBooleanDataType = new boolean[2];
//		
//		arrayOfBooleanDataType[0] = true;
//		arrayOfBooleanDataType[1] = true;
//		System.out.println(arrayOfBooleanDataType[0]);
//		System.out.println(arrayOfBooleanDataType[1]);
		
		
		Book[] arrayOfBooks = new Book[5];
		
		Book book1 = new Book();
		book1.bookName = "C programming";
		
		Book book2 = new Book();
		book2.bookName = "JAVA programming";
		
		arrayOfBooks[0] = book1;
		arrayOfBooks[1] = book2;
		
		System.out.println(arrayOfBooks[0].bookName);
		System.out.println(arrayOfBooks[1].bookName);
	}
}
