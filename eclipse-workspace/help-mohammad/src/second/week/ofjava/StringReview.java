package second.week.ofjava;

public class StringReview {
	

	
	public static void main (String[] args) {
		
		System.out.println("Java is Awesone !!");
		
		if (1 < 2) {
			System.out.println("Something ");
		}else {
			System.out.print("Else Block");
		}
		
		calculateRectangle();
		
		System.out.println("Last statement in main Method");
	}
	
	public static void calculateRectangle() {
		System.out.println("First line in the method");
		System.out.println("Printing From the method");
	}
}