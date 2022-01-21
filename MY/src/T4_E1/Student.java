package T4_E1;

import java.util.Scanner;

public class Student implements IDisplay,IInput {
   private String StudentID, name;
   
   
	@Override
	public void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Student Name :");
		this.StudentID = s.nextLine();
		System.out.print("Enter StudentID :");
		this.name = s.nextLine();
		
	}

	@Override
	public void print() {
		System.out.println("StudentID : "+this.StudentID+" Name: "+this.name );
	}

	@Override
	public void printDetails() {
		System.out.println("StudentID :"+this.StudentID);
		System.out.println("Name :"+this.name);
	}

}
