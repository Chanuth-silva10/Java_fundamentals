package Exe1;

public class Tablet extends Item{

	//Attributes
	
	private String brand;
	private String model;
	private String camera;
	
	public Tablet(int itemNo, String name, double unitPrice, int qty, String brand, String model, String camera) {
		super(itemNo, name, unitPrice, qty);
		this.brand = brand;
		this.model = model;
		this.camera = camera;
		
		
	}

	@Override
	public void printLine() {
		
		super.printLine();
		System.out.println("Brand :"+brand+"Model "+model+"Camera :"+camera);
	}

	@Override
	public void printDetails() {
		
		super.printDetails();
		System.out.println("Brand :"+brand);
		System.out.println("Model "+model);
		System.out.println("Camera :"+camera);
	}
	
	
	
}
