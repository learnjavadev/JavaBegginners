
public class LogicalOperatorsExample {

	public static void main(String[] args) {

		boolean isValid = false;
		int number1 = 10;
		int number2 = 10;
		
//		if(isValid && (number1 == number2)) { // false && true = false
//			System.out.println("Condition is true");
//		}
//		// Logical AND
//		// true && false = false
//		// false && false = false
//		// false && false = false
//		// true && true = true
//		
//		System.out.println("End program");
		
		// OR operator
//		if(isValid || (number1 != number2)) { // false || false = false
//			System.out.println("Condition is true");
//		}
//		System.out.println("End program");
		
		if(false || !false) {
			System.out.println("This statement should be executed");
		}
		
		boolean it_is_raining_outside = true;
		
		if(it_is_raining_outside) {
			// if condition is true
			// I will travel by Car
		}
		
		if(it_is_raining_outside) {
			// if condition is true
			// I will take an umbrella with me
		}else {
			// if condition is false
			// I will travel by Bike
		}
		
		boolean condition = false;
		
		do {
			/*
			 * Do action before 
			 * the condition check. 
			 * Code block is executed 
			 * at-least once.
			 */
		} while (condition);
		
		
		while(condition) {
			/*
			 * Check the condition
			 * before code block is 
			 * executed.
			 * Code block is executed
			 * only if condition is 
			 * true.
			 */
		}
	}

}
