package com.week.five;

public class RecapForEach {

	public static void main(String[] args) {
		
		int[] numbers = {123, 44, 12, 142};
		int resultEven =0;
		int resultOdd = 0;
		
		for (int number : numbers) {
			
			if (number % 2 == 0) {
				resultEven += number;
				
				System.out.println("This number is even" + number);
				
				
			}else {
				
				resultOdd += number;
			}
		}
		
		System.out.println("Print result" + (resultEven + resultOdd));
	}
}
