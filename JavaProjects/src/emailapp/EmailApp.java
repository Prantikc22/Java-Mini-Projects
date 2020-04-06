package emailapp;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter First Name: ");
		Scanner in = new Scanner(System.in);  // Create a Scanner object
		String fn = in.nextLine();
		
		System.out.print("Enter Last Name: ");
		Scanner obj = new Scanner(System.in);  // Create a Scanner object
		String ln = obj.nextLine();
		
		Email em1 = new Email(fn,ln);
		System.out.println(em1.showInfo());
	}

}
