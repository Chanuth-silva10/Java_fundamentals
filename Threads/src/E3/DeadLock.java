 package E3;

public class DeadLock {
        
	public static Object lock1 = new Object();
	public static Object lock2 = new Object();
	
	public static void main(String[] args) {
		
		Thread1 threadOne = new Thread1(lock1,lock2);
		Thread2 threadTwo = new Thread2(lock1,lock2);
		threadOne.start();
		threadTwo.start();
		
	}
}
	 class Thread1 extends Thread{
		 private Object lock1;
		 private Object lock2;
		 
		 public Thread1(Object lock1,Object lock2) {
			 this.lock1 = lock1;
			 this.lock2 = lock2;
		 }
		 
		public void run() {
			System.out.println("Started executing Thread 1");
			synchronized (lock1) {
				synchronized (lock2) {
				System.out.println("Thread 1 is holding lock 1");
			    try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
				 e.printStackTrace();
				}
			    System.out.println("Thread 1 is waiting for lock 2");
			    
					System.out.println("Thread 1 is holding lock 1 and lock  2");
				}
			}
		}
	}
     class Thread2 extends Thread{
    	 private Object lock1;
		 private Object lock2;
    	 
		 public Thread2(Object lock1,Object lock2) {
			 this.lock1 = lock1;
			 this.lock2 = lock2;
		 }
		 
				    	public void run() {
							System.out.println("Started executing Thread 2");
							synchronized (lock1) {
								 synchronized (lock2) {
								System.out.println("Thread 2 is holding lock 2");
							    try {
									Thread.sleep(10);
								} catch (InterruptedException e) {
								 e.printStackTrace();
								}
							    System.out.println("Thread 2 is waiting for lock 1");
							   
									System.out.println("Thread 2 is holding lock 1 and lock  2");
								}
							}
						}
	}
	
/*  
 * Started executing Thread 1
 * Started executing Thread 2
 * Thread 1 is holding for lock 2
 * Thread 1 is waiting for lock 2
 * Thread 1 is waiting lock 1 and lock 2
 * Thread 2 is holding lock 2
 * Thread 2 is waiting for lock 1
 * Thread 2 is holding lock 1 and lock2
 */
