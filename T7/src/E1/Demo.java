package E1;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		ArrayList<Employee> myarrlist = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		double totalSal = 0;
		
		for(int i = 0; i < 5; i++) {
			
		              
	    System.out.println("Enter Employee id " );
	    int eid = sc.nextInt();
	    System.out.println("Enter Employee name " );
	    String ename = sc.next();
	    System.out.println("Enter Employee department " );
	    String edept = sc.next();
	    System.out.println("Enter Employee salary " );
	    double esalary = sc.nextDouble();
	    
		
	    Employee empobj = new Employee(eid, ename, edept, esalary);
	    myarrlist.add(empobj);
	    
		} 
		
		//retrieve values from arrayList
	/*	   for(int i = 0; i < myarrlist.size(); i++) {
		//  System.out.println(myarrlist.get(i).id);  because public attribute
		//	System.out.println(myarrlist.get(i).getdep());
		 }*/
		
		for(Employee  item : myarrlist) {
			//System.out.println(item.getdep());
			totalSal = totalSal + item.getSalary();
			
		}
		System.out.println("total Salary : "+totalSal);
		myarrlist.removeAll(myarrlist);
	}

}
