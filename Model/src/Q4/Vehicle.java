package Q4;

public abstract class Vehicle {
	private int speed;
	public double regularPrice = 10000.00;
	private String colour;
	
	public Vehicle(int speed, double regularPrice, String colour) {
		super();
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.colour = colour;
	}

	public Vehicle(int speed, String colour) {
		super();
		this.speed = speed;
		this.colour = colour;
	}
	
	public double getRegularPrice() {
		return regularPrice;
	}
	
	public abstract double getSalePrice();
}