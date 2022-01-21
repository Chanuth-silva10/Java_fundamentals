package Q2.b;

public abstract class TV {
	private String model;
	private String size;
	
	public TV(String model, String size) {
		super();
		this.model = model;
		this.size = size;
	}
	
	public abstract void display();
}