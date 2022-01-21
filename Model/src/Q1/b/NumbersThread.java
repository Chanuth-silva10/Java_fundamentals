package Q1.b;

public class  NumbersThread extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	    
		for(int i = 0; i < 100; i++) {
			System.out.println(i + 1);
		}
	}	
}