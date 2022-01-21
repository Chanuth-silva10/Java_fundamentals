package Exercise4;
import java.util.HashMap;
import java.util.Map;

public class Main {

public static void main(String[] args) {
		
	//creating map of Student
	Map<Integer,Student> map = new HashMap<Integer,Student>();
	
	//Creating Student Objects
	Student s1 = new Student(101, "Kamal", 1);
	Student s2 = new Student(102, "Bimal", 3);
	Student s3 = new Student(103, "Vimal", 4);
	
	//Adding Student to map
	map.put(s1.getStudentID(), s1);
	map.put(s2.getStudentID(), s2);
	map.put(s3.getStudentID(), s3);

	//Passing Over the map
	for(Map.Entry<Integer, Student> entry:map.entrySet()) {
		
		int key = entry.getKey();
		Student value = entry.getValue();
		System.out.println(key+"   Details :");
		System.out.println("Student ID :"+ value.getStudentID());
		System.out.println("Student GPA :"+ value.getGpa());
		System.out.println("Student Name :"+ value.getName());
		System.out.println();
	}
	
	}
}

