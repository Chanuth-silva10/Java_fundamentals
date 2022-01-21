package Exercise_8;

public class Dog extends pet {

	 int noOfMasters;
	public Dog(String n, String o, int a,int m) {
		super(n, o, a);
		this.noOfMasters = m;
		
	}
	public Dog(String n, String o) {
		super(n ,o);
		this.noOfMasters = 1;
		
	}
	
	public void showDetails() {
		super.showDetails();
		System.out.println("I am a dog.I have  "+this.noOfMasters+"masters");
	}
	
}
