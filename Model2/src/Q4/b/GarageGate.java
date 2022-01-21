package Q4.b;

public class GarageGate {
	private String discription;

	public GarageGate(String discription) {
		super();
		this.discription = discription;
	}
	
	public void open() {
		System.out.println(discription +" is open");
	}
	
	public void close() {
		System.out.println(discription +" is close");
	}
}