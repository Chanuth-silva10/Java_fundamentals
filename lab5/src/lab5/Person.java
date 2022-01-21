package lab5;

public class Person implements ICompute{
	
		 private String name;
		 private double basicSal;
		 private double otRate;
		 private double otHrs;
		 private double netSal;
		 
		 public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getBasicSal() {
			return basicSal;
		}
		public void setBasicSal(double basicSal) {
			this.basicSal = basicSal;
		}
		public double getOtRate() {
			return otRate;
		}
		public void setOtRate(double otRate) {
			this.otRate = otRate;
		}
		public double getOtHrs() {
			return otHrs;
		}
		public void setOtHrs(double otHrs) {
			this.otHrs = otHrs;
		}
		public double getNetSal() {
			return netSal;
		}
		public void setNetSal(double netSal) {
			this.netSal = netSal;
		}
		public Person(String name, double basicSal, double otRate, double otHrs, double netSal) {
			this.name = name;
			this.basicSal = basicSal;
			this.otRate = otRate;
			this.otHrs = otHrs;
			this.netSal = netSal;
		}
		public Person(String name, double basicSal, double otRate, double otHrs) {
		    this.name = name;
			this.basicSal = basicSal;
			this.otRate = otRate;
			this.otHrs = otHrs;
		}
		public int calculate() {
			netSal = basicSal + (otHrs * otRate);
			System.out.println("Person Net Salary :"+netSal);
			return 0;
		}
		public void display() {
			System.out.println("Display Person Name :"+name);
			
		}
		 
		 
}


