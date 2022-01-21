package E3;

import java.util.Iterator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Set<Double> StudentHeight = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Student "+ (i+1));
			StudentHeight.add(sc.nextDouble());
			
		}
		
		for(Object object : StudentHeight){
			System.out.println(object);
		}
		
		
	}

}
