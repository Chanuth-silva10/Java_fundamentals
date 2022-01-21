package Q2.a;

public class MainClass {
	public static void main(String args[]) {
		Login l = Login.getInstance();
		
		System.out.println("" +l.validateUser("Manju", "Manju"));
	}
}