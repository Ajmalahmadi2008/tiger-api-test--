package com.week.ten.day.one;

import java.util.ArrayList;

public class ArryListIntroduction {

	public static void main(String[] args) {
		
		ArrayList<String> nameList = new ArrayList<>();
		
		nameList.add("Mazyar");
		nameList.add("Mohammad"); 
		nameList.add("Driss");
		
		int listSize = nameList.size();
		System.out.println("This list size is " + listSize);
	}
}
