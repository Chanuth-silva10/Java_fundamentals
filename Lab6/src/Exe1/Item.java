package Exe1;

public abstract class Item implements IPrint {
    //Attribute
	private int itemNo;
	private String name;
	private double unitPrice;
	private int qty;
	
	
	//methods
	// 1.PrintLine(); --> values in asingal line
	
	@Override
	public void printLine() {
	System.out.println("Item No"+itemNo+" Name :"+name+" Unit Price :"+unitPrice+" Quantity :"+qty );
	
		
	}
	
	// 2.PrintDetails(); --> values in multiple lines
	                                    
	@Override
	public void printDetails() {
	System.out.println("Item No :"+itemNo);
	System.out.println("Name :"+name);
	System.out.println("Unit Price :"+unitPrice);
	System.out.println("Quantity :"+qty);
	
		
	}
	//construter

	public Item(int itemNo, String name, double unitPrice, int qty) {
		this.itemNo = itemNo;
		this.name = name;
		this.unitPrice = unitPrice;
		this.qty = qty;
	}
	
	
}
