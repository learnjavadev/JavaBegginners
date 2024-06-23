
public class DoWhileExample3 {

	public static void main(String[] args) {
		
		// 2! = 1 * 2;
		// 3! = 1 * 2 * 3;
		// 4! = 1 * 2 * 3 * 4;
		
		int input = 10;
		int n = 1;
		int factorial = 1;
		
		do {
			factorial = factorial * n;
			n = n + 1;
		}while(n <= input);
		
		System.out.println("factorial ="+factorial);
	}
}
