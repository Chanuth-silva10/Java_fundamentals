package L3_E10;

public class Dog extends Pet{
	private int noOfMasters;
     public Dog(String n, String o, int a, int m) {
		super(n, o, a);
		this.noOfMasters = m;
	}
     public Dog(String n, String o) {
 		super(n, o);
 		this.age = 0;
 		this.noOfMasters = 1;
 	
 	}

	
}
