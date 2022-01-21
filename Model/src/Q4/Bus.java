package Q4;

public class Bus extends Vehicle{
	private int year;
	private double manufacturerDiscount;
	
	public Bus(int speed, String colour, int year, double manufacturerDiscount) {
		super(speed, colour);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}
	
	public double getSalePrice() {
		return super.regularPrice * (100 - manufacturerDiscount) / 100;
	}
}