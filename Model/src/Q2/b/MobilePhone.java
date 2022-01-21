package Q2.b;

public abstract class MobilePhone {
	private String model;
	private float price;
	
	public MobilePhone(String model, float price) {
		super();
		this.model = model;
		this.price = price;
	}

	public abstract void display();
}