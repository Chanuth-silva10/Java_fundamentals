package Exercise2;

import java.util.ArrayList;
import java.util.List;
//import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		List<Student> StudentList = new ArrayList<>();
		
		StudentList.add(new Student(100, "Rajeev", 2));
		StudentList.add(new Student(101, "John", 4));
		StudentList.add(new Student(102, "Steve", 2));
		
		//passing over the list throught the list
		//Iterating the List element using for-each loop
		
		for(Student s : StudentList) {
			System.out.println("Student ID: " + s.getStudentID());
			System.out.println("Student Name: " + s.getName());
			System.out.println("Student ID: " + s.getGpa());
			System.out.println();

			
		}
	}

}
