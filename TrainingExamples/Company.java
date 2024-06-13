
public class Company {

	String name; // "infosys/TCS"
	String product; // "software/headphone"
	int revenue; // 1232156/4454
	String address; // Banglore/Pune

	// method/function
	void createAProduct(){
		System.out.println("This method is to create a product");
	}

	void SellAProduct(){
		System.out.println("This method is to sell a product");
	}

	void generateARevenue(){
		System.out.println("This method is to generate the revenue");
	}



	public static void main(String[] args) {
		System.out.println("Hello, This is a company class!");
		Company company1 = new Company();

		// call a class method
		company1.generateARevenue();
		company1.SellAProduct();
		company1.createAProduct();

	}
}
