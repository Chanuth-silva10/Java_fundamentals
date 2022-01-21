package Q4.b;

public class Oven {
	private String name;

	public Oven(String name) {
		super();
		this.name = name;
	}
	
	public void on() {
		System.out.println(name +" oven is on");
	}
	
	public void off() {
		System.out.println(name +" oven is off");
	}
}