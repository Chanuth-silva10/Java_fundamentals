// Inheritance the Person Calss and create a Student Class
// The student class should have the following
// properties
// studentId, name, mobileno, GPA flowing 
// we will hava a method called
//displayClass()

// Topics Covered
// 1.Inheritence
// 2.Calling super class constructors
// 3.Using protected keyword
// 4.overriding 
// 5.overloading
// 6.Creating Object
// 7.Using object of the Base Class

package Inheritence;

//import Inheritence.Person.Student;

class Person{
	protected String name;
	protected String mobileNo;
	
	
	Person() {
		mobileNo = "0711234562";
		name  = "";
	}
	public Person(String name, String mobileNo) {
		this.name = name;
		this.mobileNo = mobileNo;

	}
	public String getName(){
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNo(){
		return this.mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public void display() {
		System.out.println("Name :" + this.name +"Mobile No :"+this.mobileNo);
		
	}
}
	
	class  Student extends Person{
		protected int studentId;
		protected float gpa;
		
		public Student() {
			gpa = 2.0f;
		}
		
		public Student(int studentId, String name, String mobileNo, float gpa) {
			super(name,mobileNo);
			this.studentId = studentId;
			this.gpa = gpa;
			
			}
		public int getStudentId() {
			return this.studentId;
		}
		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}
		public float getGpa(){
			return this.gpa;
		}
		public void setGpa(float gpa) {
			this.gpa = gpa;
		}
		public void display() {
			super.display();
			System.out.println("Student ID :"+ this.studentId+  "GPA :"+this.gpa);
			
		}
		public void dispalyClass() {
			if(gpa < 3)
				System.out.println("pass");
		  else
			System.out.println("You have graduate with a class");
		}
		
		
		
	}
	

public class Main {

	public static void main(String[] args) {
        Student std = new Student(100, "maduka", "0123654987", 3.2f);
        std.display();
        std.dispalyClass();
        
        //SuperClass x = new SuperClass();
        //SuperClass y = new SubClass();
        
        Person p = new Student(10, "Namali", "077623232",3.1f);
        p.display();
        //
       // SubClass z = (SubClass)[SuperClass variables]>>>>>>Csating
        Student s =(Student) p;//displayClass() tyene Student eka tula.(CASTING)
        s.dispalyClass();
        
        
	}

}
