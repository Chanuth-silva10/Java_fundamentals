package E1;

public class Employee {
    private int id;
    private String name;
    private double bsalary, netsalary, totSalary;
	
    public Employee(int id, String name, double bsalary, double netsalary) {
		this.id = id;
		this.name = name;
		this.bsalary = bsalary;
		this.netsalary = netsalary;
		
	}
    
    public double calTotalSalary() {
    	return bsalary + netsalary ;
    }
    
    public int getId() {
    	return id;
    }
    public String getName() {
    	return name;
    }
    
    
    
}
