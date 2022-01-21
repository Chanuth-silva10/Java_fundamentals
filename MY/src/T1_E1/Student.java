package T1_E1;

public class Student {
      
	private double marks1,marks2,marks3;
	private double avg = 0.0;
	private String id, name;
	
	//default construter
	public Student() {
		System.out.println("Default construter>>>>>>>>>>>>");
		marks1  = 0;
		marks2  = 0;
		marks3 = 0;
		
		
	}
	//parameter construter
	public Student(int marksE1, int marks2, int marks3, String id, String name ) {
		System.out.println("Parametr construter>>>>>>>>>>>>>>");
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
		this.id =  id;
		this.name = name;
		
	}
	
	public void calculate() {
		
		
		avg = (marks1 + marks2 + marks3)/3;
		
	}
	public void display() {
		System.out.println("ID :  " +id);
		System.out.println("Student name :"+name);
		System.out.println("Avreage is : "+ avg);
	}
}
