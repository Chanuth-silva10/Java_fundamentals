package Q1.a;

public class PrintThread extends Thread{
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println(i+1);
		}
	}
}