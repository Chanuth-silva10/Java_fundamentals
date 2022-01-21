package L3_E7;

public class Student extends Person {
      private String studentID;
      
      public Student(String name, String address, String studentID) {
      	super(name,address);
      	this.studentID =studentID;
      }
      public void showDetails() {
    	  super.showDetails();
    	  System.out.println("Student Id:"+studentID);
      }
}
