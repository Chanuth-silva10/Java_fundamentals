package E4;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Map<String,Integer> number1 = new LinkedHashMap<String,Integer>();
		T1 t1 = new T1(number1);
		T2 t2 = new T2(number1);
		
		
	}

}

class T1 extends Thread{

	private Map<String, Integer> number1;
    Scanner sc = new Scanner(System.in);
	public T1(Map<String, Integer> number1) {
		this.number1 = number1;
	}
	
	public void run() {
		synchronized (number1) {
			 System.out.println("Thread 01 started");
			 for(int i = 0; i < 3; i++) {
				 System.out.println("please enter no1 and no2 as keyboard inputs 3 times");
			     System.out.println("Enter no1 : ");
			     int no1 = sc.nextInt();
			     System.out.println("enter no2 :");
			     int no2 = sc.nextInt();
			     
			     number1.put(no1 + "*" + no2 + "=", no1 * no2);
			 }
			 
			 System.out.println("Thread 1 goes to waiting state /n");
			 try {
				number1.wait();
				T1 t1 = new T1(number1);
				t1.start();
				T2 t2 = new T2(number1);
				t2.start();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
class T2 extends Thread{

	private Map<String, Integer> number1;

	public T2(Map<String, Integer> number1) {
		this.number1 = number1;
	}
	
	public void run() {
		synchronized (number1) {
			 System.out.println("Thread 01 started");
			 System.out.println("Showing no1 * no2 = reslt as output");
			 
			for(Map.Entry<String,Integer>  entry : number1.entrySet()) {
				System.out.println(entry.getKey());
				System.out.println(entry.getValue());
			}
			
			System.out.println("Thread 1 notified");
			number1.notify();
			
		}
	}
	
}