package L3_E7;

public class PartTimeStudent extends Student{
     private int noOfHourse;
     
     public PartTimeStudent(String name, String address, String studentID, int noOfHourse) {
       	super(name,address,studentID);
       	this.noOfHourse =noOfHourse;
       }
     public void showDetails() {
    	 super.showDetails();
    	 System.out.println("Number Of Working Hours :"+noOfHourse);
     }
}
