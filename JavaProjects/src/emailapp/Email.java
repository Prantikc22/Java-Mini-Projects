package emailapp;

import java.util.Scanner;

public class Email {
	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private String company = "abc.com";
	
	//Constructor to receive first and last name
	public Email(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		//System.out.println("Email Created for: " +this.firstname+" "+this.lastname);
		
		//Getting the department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
		//Generating the random password
		System.out.print("Enter password length: ");
		Scanner in = new Scanner(System.in); 
		int len = in.nextInt();
		this.password = setPassword(len);
		System.out.println(""+this.password);
		
		//Generating the email
		email = firstname.toLowerCase() + "." +lastname.toLowerCase() + "@" + department +"."+ company;
		//System.out.println("Your email is: "+email);
		
	}
	//Ask for the department
	private String setDepartment() {
		System.out.print("Department Codes:\n1 for Sales \n2 for Development \n3 for Accounts \nEnter the code: ");
		Scanner in = new Scanner(System.in);
		int dep = in.nextInt();
		if(dep==1) {
			return "Sales";
		}
		else if(dep==2) {
			return "Development";
		}
		else if(dep==3) {
			return "Accounts";
		}
		else {
			return "";
		}
				
	}
	//Generate a random password
	private String setPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&*";
		char password[] = new char[length];
		for(int i=0;i<length;i++) {
			int rand = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand); 
		}
		return new String(password);
	}
	//Set the mailbox capacity
	public void setmailcap(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	//Set the alternate email
	public void setaltemail(String altemail) {
		this.alternateEmail = altemail;
	}
	//Change the password
	public void setnewpassword(String newpassword) {
		this.password = newpassword;
	}
	
	public int getmailboxcapacity() {
		return mailboxCapacity;
	}
	
	public String getalternateemail() {
		return alternateEmail;
	}
	
	public String getpassword() {
		return password;
	
	}
	
	public String showInfo() {
		return "Display Name: " + firstname + " " + lastname +
				"\nCompany Email: " + email +
				"\nMailbox Capacity: " + mailboxCapacity + " MB";
	}
}
