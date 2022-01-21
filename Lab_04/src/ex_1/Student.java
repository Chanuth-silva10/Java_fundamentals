package ex_1;

public class Student {


	private String name,degree,mobile;
	private static int max = 100;
	public Student(String name, String degree, String mobile) {
		this.name = name;
		this.degree = degree;
		this.mobile = mobile;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public  int getNextStudentId() {
        return max++; 
	}
	 public void print() {
		 System.out.println("Student name :"+ getName());
		 System.out.println("Degree :"+ getDegree());
		 System.out.println("Mobile :"+ getMobile());
		 System.out.println("Student ID :"+ getNextStudentId());
		 System.out.println();


	 }
	
	
	
}
