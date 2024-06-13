import com.example.mobilephone.MobilePhone;

public class Book {

	String bookName;
	int noOfPages;
	int yearOfPublish;
	String publisher;
	String author;
	
	// what are the behaviors
	// 1. publishBook()
	// 2. turnAPage()
	
	public void publishBook() {
		// work related to book publish
		System.out.println("This is method publishBook()");
	}
	
	public void turnAPage() {
		// turning a page of a book
		System.out.println("Turning a page");
		//
		//
		//
	}
	
	public static void main(String[] args) {
		Book b1 = new Book();
		MobilePhone nokia = new MobilePhone();
		System.out.println("This is book store!");
	}
}
