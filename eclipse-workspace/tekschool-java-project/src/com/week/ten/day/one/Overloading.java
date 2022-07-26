package com.week.ten.day.one;

public class Overloading {

	public void doAdding(short first, short second) {
		int result = first + second;
		System.out.println(" From shor parameters " +result);
		
	}
	
	public void doAdding(int first, int second) {
		int rsult = first + second;
		System.out.println("From double parameters" + result);
		
	}
	
	public void doAdding(int first, int second, int third) {
		int result = first + second + third;
		System.out.println("From Interger parameters" +result);
	}
}

