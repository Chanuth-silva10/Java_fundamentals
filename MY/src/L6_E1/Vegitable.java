package L6_E1;

public class Vegitable extends Item {
	//Attributes
    private boolean organic;
    private int aclories;
    
	public Vegitable(int itemNo, String name, double unitPrice, int qty, boolean organic, int aclories) {
		super(itemNo, name, unitPrice, qty);
		this.organic = organic;
		this.aclories = aclories;
	}

	@Override
	public void printLine() {
		super.printLine();
		System.out.println("Organic : "+organic+"Calories : "+aclories);
		
	}

	@Override
	public void printDetails() {
		
		super.printDetails();
		System.out.println("Organic"+organic);
		System.out.println("Calories"+aclories);
		
	}
   
    //constructor
	
}
