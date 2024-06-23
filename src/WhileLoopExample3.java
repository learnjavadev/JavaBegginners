
public class WhileLoopExample3 {

	public static void main(String[] args) {
	
		// sum of digits of a number
		// 123 = 1+2+3 = 6
		
		// 123%10 = 3 => 123/10 = 12
		// 12%10 = 2 => 12/10 = 1
		
		int number = 888; 
		int sum = 0;
		
		while(number != 0) {
			int seperatedDigit = number % 10;
			sum = sum + seperatedDigit;
			number = number / 10; // 9/10 = 0.9
		}
		
		System.out.println(sum);

	}

}
