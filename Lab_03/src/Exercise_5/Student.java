package Exercise_5;

public class Student extends Person {

	String studentid;
	
public Student(String newName,String newAddress,String newstudentid) {
		super(newName,newAddress);
		studentid = newstudentid;
	}
	void showDetails(){
		super.showDetails();
		System.out.println("My ID is" +studentid+"\n");
		
	}
}
