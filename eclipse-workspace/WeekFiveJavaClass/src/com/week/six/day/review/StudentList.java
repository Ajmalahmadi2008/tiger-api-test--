package com.week.six.day.review;

public class StudentList {

	
	public static void main(String[] args) {
		
		Student firstStudent = new Student();
		firstStudent.setFirstName("Waris");
		firstStudent.setLastName("Hotak");
		firstStudent.setAge(21);
		firstStudent.setGrade('B');
		
		System.out.println(firstStudent.getFirstName());
	}
}
