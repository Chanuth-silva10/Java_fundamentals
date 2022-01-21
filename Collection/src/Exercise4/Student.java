package Exercise4;

public class Student {

	 private int studentID, gpa;
	    private String name;
	    
	    //constuctor 
		public Student(int studentID, String name, int gpa) {
			super();
			this.studentID = studentID;
			this.gpa = gpa;
			this.name = name;
		}

		public int getStudentID() {
			return studentID;
		}

		public void setStudentID(int studentID) {
			this.studentID = studentID;
		}

		public int getGpa() {
			return gpa;
		}

		public void setGpa(int gpa) {
			this.gpa = gpa;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
}
