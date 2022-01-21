package Q1.b;

public class ThreadBase {
	public static void main(String[] args) {
		NumbersThread t1 = new NumbersThread();
		NumbersThread t2 = new NumbersThread();
		NumbersThread t3 = new NumbersThread();
		
		t1.setName("Red");
		t2.setName("Green");
		t3.setName("Blue");
		
		t1.start();
		t2.start();
		t3.start();
		
		for(int i = 0; i < 100; i++) {
			System.out.println("SLIIT");
		}
		
		if(t1.isAlive()) {
			System.out.println(t1.getState());
		}
	}
}