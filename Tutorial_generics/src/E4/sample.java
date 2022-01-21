package E4;

import java.util.Scanner;
public class sample {
     
	private static Integer[] takeinput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		int size = sc.nextInt();
		
		Integer[] myarray = new Integer[size];
		
		for(int i = 0; i<size; i++) {
			System.out.println("Enter thr value for the index "+ i);
			myarray[i] = sc.nextInt();
		}
		return myarray;
	}
	private static Integer findmax(Integer[] values) {
		
		Integer max = values[0];
		
		for(int i = 1; i<values.length; i++) {
			
			if(max < values[i]) {
				max = values[i];
			}
		}
		return max;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Integer myvalarray[] = takeinput();
		
		System.out.println(findmax(myvalarray));
		
	}
}
