package Q4.a;

public class MainApp {

	public static void main(String[] args) {
		CreditCard c1 = CreditCard.getInstance();
		CreditCard c2 = CreditCard.getInstance();

		System.out.println("" +c1.validate("1234567891234567", 6));
		System.out.println("" +c2.validate("1234567891234567", 7));
		
		System.out.println("" +c1.equals(c2));
	}

}