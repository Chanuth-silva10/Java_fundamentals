package E2;

public class Student {
    private int studentID;
    private String Name;
    private double GPA;
	public Student(int studentID, String Name, double GPA) {
		this.studentID = studentID;
		this.Name = Name;
		this.GPA = GPA;
	}
	public int getStudentID() {
		return studentID;
	}
	
	public String getName() {
		return Name;
	}
	
	public double getGPA() {
		return GPA;
	}
	
	
    
    
}
