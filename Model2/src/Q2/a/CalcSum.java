package Q2.a;

public class CalcSum implements Runnable{
	public void run() {
		int sum = 0;
		
		for(int i = 1; i <= 100000; i++) {
			sum = sum + i;
		}
		
		System.out.println("Answer : " +sum);
		System.out.println(Thread.currentThread().getName());
	}
}

