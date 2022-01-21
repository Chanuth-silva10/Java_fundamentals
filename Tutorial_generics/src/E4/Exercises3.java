package E4;
import java.util.Scanner;
public class Exercises3 {
     
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
	private static <E extends Comparable<E>  >   E findmax( E[] values) {
		
		E max = values[0];
		
		for(int i = 1; i<values.length; i++) {
			
			if(values[i].compareTo(max) > 0) {
				max = values[i];
			}
		}
		
		return max;
	}
	

	public static void main(String[] args) {
		
	//	Integer myvalarray[] = takeinput();
		Double mydarray[] = {90.2,67.87};
		String myarr[] = {"A","D","S"};
		
		System.out.println(findmax(myarr));
		
	}
}
