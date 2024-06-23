
public class DataTypeExample1 {

	public static void main(String[] abc) {
		
		String str1 = "This java programming!";
		
		System.out.println(str1);
		
		Book book1 = new Book(); // object creation
		book1.bookName = "bookName1";
		
		System.out.println(book1.bookName);
		
		book1.publishBook(); // what will be output of this statement?
		book1.turnAPage();
	}
}
