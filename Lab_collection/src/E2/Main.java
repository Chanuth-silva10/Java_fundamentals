package E2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student(100,"Chanuth",2.1);
		Student s2 = new Student(100,"Chanuth",2.1);
		Student s3 = new Student(100,"Chanuth",2.1);
		
		List<Student> StudentList = new ArrayList<Student>();
		StudentList.add(s1);
		StudentList.add(s2);
		StudentList.add(s3);
		
		for(Student s:StudentList) {
			System.out.println("Student Id = "+s.getStudentID());
			System.out.println("Student Name = "+s.getName());
			System.out.println("Student GPA = "+s.getGPA() +"\n");
			
		
		}
	}

}
