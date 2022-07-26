package second.week.ofjava;

public class Main {
	
	public static void main(String[] args) {
		
		String firstName ="Mohammad";
		String lastName = "Ahmadi";
		
		int firstNamelength = firstName.length();
		System.out.println("lenght of First Name :::" + firstNamelength);
		
		int lastNamelength = lastName.length();
		
		System.out.println("length of last name :::" + lastNamelength);
		
		String fullName = firstName + " " + lastName;
		int fullNamelength = fullName.length();
		System.out.println("Length of Full name ::: " + fullNamelength);
		
		
		
		
	}

}
