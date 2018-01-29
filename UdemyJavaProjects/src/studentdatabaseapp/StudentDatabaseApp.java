package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
	public static void main(String[] args) {
		//Ask how many number of users to add
		System.out.print("Enter number of students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
	
		
		//create n number of students
		for(int n=0; n < numOfStudents; n++){
			students[n]=new Student();
			students[n].enroll();
			students[n].payTuition();
			
		}
		
		for (Student student : students) {
			System.out.println(student.showInfo());
		}

	}

}
