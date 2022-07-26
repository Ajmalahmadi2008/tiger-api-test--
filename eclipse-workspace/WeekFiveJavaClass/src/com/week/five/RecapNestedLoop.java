package com.week.five;

public class RecapNestedLoop {
	
	public static void main(String[] args) {
		
		int[][] numbers = {
				
				{12, 13, 14, 15},
				{16, 17, 18, 19},
				{20, 21, 22, 23}
				
				
		};
		
		for (int row = 0; row < numbers.length; row ++) {
			
			
			for (int col = 0; col < numbers[row].length; row ++) {
				
				int number = numbers[row][col];
				System.out.println(number);
				
				if (number % 2 == 0) {
					
					System.out.println("This number is even" + numbers[row][col]);
				}
			}
		}
	}
	

}
