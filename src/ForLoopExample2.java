
public class ForLoopExample2 {

	public static void main(String[] abc) {
		
		// print numbers decreasing oder till zero
		// 5 = 5 4 3 2 1 0
		
		int number = 5;
		
		for(int temp=number;temp>=0;--temp) {
			System.out.println(number);
			number = number -1;
		}
		
	}
}
