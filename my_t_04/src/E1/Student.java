package E1;

import java.util.Scanner;

public class Student implements IDisplay,IInput {
	
     private String studentID,name;

     public void print() {
     	System.out.println("Student  ID :"+this.studentID+"name :"+this.name);
     }

 	@Override
 	public void input() {
 		Scanner s = new Scanner(System.in);
 		System.out.print("Enter StudentID :");
 		this.studentID = s.nextLine();
 		System.out.print("Enter name :");
 		this.name = s.nextLine();
 		
 	}

 	@Override
 	public void printDetails() {
 		System.out.println("Book Id :"+this.studentID);
 		System.out.println("Title :"+this.name);
 		
 	}
 	
     
}
