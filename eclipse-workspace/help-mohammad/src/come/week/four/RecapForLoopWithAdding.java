package come.week.four;

public class RecapForLoopWithAdding {
	
	public static void main(String[] args) {
		 
		char[] letters = {'G', 'o', 'o', 'd', ' ' , 'E' , 'v', 'e', 'n', 'i', 'n', 'g',};
		
		String newLetter = "";
		
		for (int indexOfArray = 0; indexOfArray < letters.length; indexOfArray ++) {
			
			newLetter = newLetter + (letters[indexOfArray]);
			
	
		}
		
		System.out.println(newLetter);
	}
	

}
