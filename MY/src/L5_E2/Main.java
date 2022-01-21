package L5_E2;



public class Main {

	public static void main(String[] args) {
		Person ob1 = new Person("Chanuth", 40, 10, 5);
		ob1.calculate();
		ob1.display();
		
		ICompute ob3 = new Person("Chanuth", 40, 10, 5);
		ob3.calculate();
		ob3.display();
		
		ICompute ob2 = new Box(10,20, 5);
		ob2.calculate();
		ob2.display();

	}

}
