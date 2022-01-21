package Q4;

public class MyOwnAutoShop {

	public static void main(String[] args) {
		Vehicle v1 = new Truck(150, "Blue", 1000);
		System.out.println(v1.getSalePrice());
		
		Vehicle v2 = new Bus(250, "White", 2017, 40);
		System.out.println(v2.getSalePrice());
	}
}