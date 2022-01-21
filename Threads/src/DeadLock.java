
public class DeadLock {
        
	public static Object lock1 = new Object();
	public static Object lock2 = new Object();
	
	public static void main(String[] args) {
		
		ThreadOne threadOne = new ThreadOne();
		ThreadTwo threadTwo = new ThreadTwo();
		threadOne.start();
		threadTwo.start();
		
	}
	static class ThreadOne extends Thread{
		
		
			public void run() {
				System.out.println("Started executing Thread 1");
				synchronized (lock1) {
					System.out.println("Thread 1 is holding lock 1");
				    try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
					 e.printStackTrace();
					}
				    System.out.println("Thread 1 is waiting for lock 2");
				    synchronized (lock2) {
						System.out.println("Thread 1 is holding lock 1 and lock  2");
					}
				}
			}
		
		
	}
    static class ThreadTwo extends Thread{
    	
			    	public void run() {
						System.out.println("Started executing Thread 2");
						synchronized (lock2) {
							System.out.println("Thread 2 is holding lock 2");
						    try {
								Thread.sleep(10);
							} catch (InterruptedException e) {
							 e.printStackTrace();
							}
						    System.out.println("Thread 2 is waiting for lock 1");
						    synchronized (lock1) {
								System.out.println("Thread 2 is holding lock 1 and lock  2");
							}
						}
					}
	}
	
}
