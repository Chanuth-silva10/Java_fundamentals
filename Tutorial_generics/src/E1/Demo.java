package E1;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		//keyboard input
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter employee id");
	//	String id = sc.next();
	//	int eid =   Integer.parseInt(id);
		
		int eid = Integer.parseInt(sc.next());//to use the wrapper class
		
		System.out.println("Enter employee name");
		String ename = sc.next();
		System.out.println("Enter basic salary");
		double bsalary = Double.parseDouble(sc.next());
		System.out.println("Enter net Salary");
		double nsalary = Double.parseDouble(sc.next());
		
		Employee e  = new Employee(eid, ename, bsalary, nsalary);
		
		System.out.println("Employee id : " + e.getId());
		System.out.println("Employee name : " + e.getName());
		System.out.println("Employee Total Salary : " + e.calTotalSalary());
		

	}

}
