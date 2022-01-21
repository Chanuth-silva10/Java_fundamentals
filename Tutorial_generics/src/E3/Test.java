package E3;

import java.util.List;
import java.util.ArrayList;

public class Test {

	private static <E extends Number> double CalculateSum(List<E> myarglist) {
		 
		double sum = 0.0;
		
		for(E val : myarglist) {
			
			sum = sum + val.doubleValue();
		}
		return sum;
	}
	public static void main(String[] args) {
		List mylist = new ArrayList<>();
		mylist.add(25.f);//any data type value enter
		mylist.add(10);
		
		System.out.println("Sum is = "+ CalculateSum(mylist));
	}

}
