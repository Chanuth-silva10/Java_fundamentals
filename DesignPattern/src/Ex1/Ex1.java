package Ex1;
//singelton

class Singleton{
	private static  Singleton instance = null;
	
	private Singleton() {
       System.out.println("Singleton Instance created ");
       
	}
	public synchronized static Singleton getInstance(){
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}

public class Ex1 implements Runnable {

	public static void main(String[] args) {
		
		Thread thread = new Thread(new Ex1());
		thread.start();
				
		for(int i = 0; i < 10; i++) {
			Singleton.getInstance();
	    }
	}
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			Singleton.getInstance();
		}	
	}
}
