package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String department;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private String password;
	private int defaultPasswordLength=8;
	private String email;
	private String companySuffix="abccompany.com";
	
	//Constructor to receive fistname and lastname
	public Email(String firstName, String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
		//System.out.println("Email created " +this.firstName+ " "+this.lastName );
		this.department=setDepartment();
		//System.out.println("Department is "+ this.department);
		
		//call a method that generates random password
		this.password=randomPassword(defaultPasswordLength);
		System.out.println("Password is: "+ this.password);
		
		//combine email elements
		this.email= this.firstName.toLowerCase()+"."+this.lastName.toLowerCase()+"@"+this.department+"."+this.companySuffix;
		//System.out.println("Email ID is:"+this.email);
	}
	
	//Ask for the department
	private String setDepartment(){
		System.out.print("New worker: " + this.firstName+ ".\nDepartment Codes\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter the department code:");
		int deptChoice = new Scanner(System.in).nextInt();
		switch(deptChoice){
		case 1: return "Sales";
		case 2: return "Development";
		case 3: return "Accounting";
		default: return "";
		
		}
		
	}
	
	//Generate a random password
	private String randomPassword(int length){
		String passwordSet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] passwrd= new char[length];
		for(int i=0;i<length;i++){
			int rand = (int)(Math.random()*passwordSet.length());
			passwrd[i]=passwordSet.charAt(rand);
		}
		return new String(passwrd);
	}
	
	//Set the mailbox capacity
	public void setMailboxCapacity(int capacity){
		this.mailboxCapacity = capacity;
	}
	
	//Set the alternate Email
	public void setAlternateEmail(String altEmail){
		this.alternateEmail=altEmail;
	}
	
	//Change the password
	public void changePassword(String password){
		this.password=password;
	}
	
	
	public int getMailboxCapacity(){return this.mailboxCapacity;}	
	public String getAlternateEmail(){ return this.alternateEmail;}
	public String getPassword(){return this.password;}
	
	public String showInfo(){
		return "DISPLAY NAME: " + this.firstName + " " + this.lastName +
				"\nCOMPANY EMAIL: " + this.email + 
				"\nMAILBOX CAPACITY " + this.mailboxCapacity + "MB";
	}

}
