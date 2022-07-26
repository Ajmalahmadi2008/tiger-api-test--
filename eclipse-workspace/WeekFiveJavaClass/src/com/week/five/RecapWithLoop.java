package com.week.five;

public class RecapWithLoop {

	
	public static void main(String[] args) {
		
		String text = "Welcome";
		
		char[] textInArray = text.toCharArray();
		
		for( char character : textInArray) {
			
			System.out.print("(" +character +")");
		}
	}
}
