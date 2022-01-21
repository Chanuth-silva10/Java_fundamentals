package Q1.a;

public class ThreadMain {
	public static void main(String[] args) {
		PrintThread t1 = new PrintThread();
		Thread t2 = new Thread(new SLIITThread());
		
		t1.start();
		t2.start();
	}
}