package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstname;
	private String lastname;
	private int gradeyear;
	private String studentID;
	private String courses = null;
	private int tuitionbalance;
	private static int cost = 600;
	private static int id = 1000;
	int count=0;
	

	//Constructor prompts user to enter student name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first name: ");
		this.firstname = in.nextLine();
		
		System.out.print("Enter last name: ");
		this.lastname = in.nextLine();
		
		System.out.print("Enter 1 for Freshmen \n2 for Sophmore \n3 for Junior \n4 for Senior \nEnter student level: ");
		this.gradeyear = in.nextInt();
		
		setStudentID();
		
		//System.out.println(firstname + " " + lastname + " " + gradeyear + " " + studentID);
		
	}
	//Generate ID
	private void setStudentID() {
		id++;
		this.studentID = gradeyear + "" + id;
	}
	
	//Enroll in courses
	public void enroll() {
		do {
			System.out.print("Enter courses to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")) {
				count++;
				courses = courses + "\n " + course;
				tuitionbalance = tuitionbalance + cost;
			}
			else {
				System.out.println("You enrolled into " +count+ " courses");
				break;
			}
		} while(1 != 0);
		//System.out.println("Enrolled in: "+courses);
		System.out.println("Tuition Balance: $"+tuitionbalance);
	}
	
	//View balance
	public void viewbalance() {
		System.out.println("Your tuition balance is $" +tuitionbalance);
	}
	
	//Pay tuition
	public void paytuition() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your payment: $");
		int payment = in.nextInt();
		tuitionbalance = tuitionbalance - payment;
		System.out.println("Thank you for your payment of $" +payment);
		viewbalance();
	}
	
	//Show status
	public String showInfo(){
		return "Name: " + firstname + " " + lastname +
				"\nGrade Level: " + gradeyear +
				"\nStudent ID: " + studentID + 
				"\nCourses Enrolled: " + courses +
				"\nBalance: $" + tuitionbalance;
		}
}
