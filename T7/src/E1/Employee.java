/*
 
   The manager of the ABC Company wants to develop a system with the following requirements.
1. There should be a way to store employee details (id, name, department and the salary.
2. Enter the details by the receptionist through the keyboard
3. When entering, it prompts to store 5 employee details at once.
4. Then it should be able to print the total salary of the 5 employees.
5. It should facilitate to remove the details of the all 5 employee details at once.
   As a developer, select the most suitable collection framework to implement the given scenario.
   Then implement the necessary classes and the main method to demonstrate the requirements of
    the manager. 
 
 
 
 
 */
package E1;

public class Employee {
	
  public int id;
  private String name,department;
  private double salary;
  
public Employee(int id, String name, String department, double salary) {
	this.id = id;
	this.name = name;
	this.department = department;
	this.salary = salary;
}


public String getName() {
	return name;
}


public String getdep() {
	return department;
}


public double getSalary() {
	return salary;
}


   
  
}
