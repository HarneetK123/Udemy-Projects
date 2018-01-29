package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses="";
	private int tuitionBalance=0;
	private static int costOfCourse = 600;
	private static int id=1000;

	//Constructor: prompts name and year
	public Student(){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student's First Name: ");
		this.firstName=in.nextLine();
		
		System.out.print("Enter student's Last Name: ");
		this.lastName=in.nextLine();
		
		System.out.print("Enter student's Grade Level:\n1- Freshman\n2- Sophmore\n3- Junior\n4- Senior ");
		this.gradeYear=in.nextInt();
		
		setStudentID();
		
		
		
		
	}
	
	//Generate ID
	private void setStudentID(){
		id++;
		this.studentID = this.gradeYear + ""+ this.id;
	}
	
	//Enroll in courses
	public void enroll(){
		do{
			System.out.print("Enter course to enroll (Q to Quit): ");
			Scanner in = new Scanner(System.in);
			String course=in.nextLine();
			if(!course.equals("Q")){
				this.courses= courses + "\n " + course;
				this.tuitionBalance=this.tuitionBalance+this.costOfCourse;
			}
			else
				break;
			
		}
		while(1!=0);
		
		
	}
	
	//View Balance
	public void viewBalance(){
		System.out.println("Your Balance is: $"+ this.tuitionBalance);
	}
	
	//Pay Tuition
	public void payTuition(){
		viewBalance();
		System.out.print("Enter your payment: $");
		int payment = new Scanner(System.in).nextInt();
		this.tuitionBalance = this.tuitionBalance - payment;
		System.out.println("Thank you for your payment of $"+payment);
		viewBalance();
	}
	
	//Show Status
	public String showInfo(){
		return "Name: "+ firstName+" "+lastName+
				"\nGrade Year: "+ gradeYear+
				"\nStudent ID: "+studentID+
				"\nCourses Enrolled: "+ courses+
				"\nBalance: $" + tuitionBalance;
	}
	
}
