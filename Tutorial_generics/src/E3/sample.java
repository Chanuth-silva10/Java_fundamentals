package E3;


import java.util.List;
import java.util.ArrayList;

public class sample {

	private static int CalculateSum(List<Integer> myarglist) {
		 
		int sum = 0;
		
		for(Integer val : myarglist) {
			
			sum = sum + val;
		}
		return sum;
	}
	public static void main(String[] args) {
		List mylist = new ArrayList<>();
		mylist.add(19);
		mylist.add(10);
		
		System.out.println("Sum is = "+ CalculateSum(mylist));
	}

}
