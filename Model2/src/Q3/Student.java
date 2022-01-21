package Q3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {
	private int id;
	private String name;
	private int noOfSubjects;
	private float marks[];
	
	Scanner sc = new Scanner(System.in);
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public float inputMarks(int index)         throws MarksException {
		System.out.print("Enter mark " +index+ " :");
		float mark = sc.nextFloat();
		
		if(mark < 0 || mark > 100) {
			throw new MarksException(mark);
		}
		
		else {
			return mark;
		}
	}
	
	public void input(){
		
		try {
			System.out.print("No of subjects : ");
			
			this.noOfSubjects = sc.nextInt();
			this.marks = new float[noOfSubjects];
			
			for(int i = 0; i < noOfSubjects; i++) {
				marks[i] = inputMarks(i + 1);
			}
			
		}catch(InputMismatchException e1) {
			e1.printStackTrace();
			System.out.println("Input mismatch exception handled");
			
		}catch(MarksException e2) {
			e2.printStackTrace();
			System.out.println("Marks exception handled");
		}

	}
	
	public float getAverage() {
		float average = 0;
		float total = 0;
		
		try {
			for(int i = 0; i < noOfSubjects; i++) {
				total = total + marks[i];
			}
			
			average = total / noOfSubjects;
			
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Arithmetic exception handled");
		}
		
		return average;
	}
}