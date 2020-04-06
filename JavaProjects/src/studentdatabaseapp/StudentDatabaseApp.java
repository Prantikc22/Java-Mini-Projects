package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		//Ask how many users you want to add
		System.out.print("Enter number of students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numofstudents = in.nextInt();
		Student students[] = new Student[numofstudents];
		
		//Create new n students (*****Array of objects: VERY IMPORTANT TO KNOW*****)
		for(int n=0;n<numofstudents;n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].paytuition();
		}
		System.out.println("*********STUDENT DATA***************");
		for(int n=0;n<numofstudents;n++) {
			System.out.println(students[n].showInfo());
		}
	}

}
