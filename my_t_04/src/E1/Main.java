package E1;

public class Main {

	public static void main(String[] args) {
		
		Book b1 = new Book();
		Student s1 = new Student();
	
		IDisplay i = new Book();
		IInput i2 = new Student();
		
		b1.input();
		b1.printDetails();
		s1.input();
		s1.printDetails();
		

	}

}
