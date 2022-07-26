package second.week.ofjava;

public class GradesExample {

	
	public static void main(String[] args) {
		
		int[] numbers = new int [4];
		
		numbers [0] = 10;

		numbers [1] = 20;
		numbers [2] = 30;
		numbers [3] = 40;
		
		int result = 1;
		
		result *= numbers [0];
		result *= numbers [1];
		result *= numbers [2];
		result *= numbers [3];
		result *= numbers [4];
		
		System.out.println("Total is" + result);
		
	}
}
