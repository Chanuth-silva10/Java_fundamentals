package Generic_Method;

public class Test {
   
	public static <E> void   printArray(E[] element) {
		for(E elem : element) {
			System.out.print(elem +"  ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
	 	 
		Integer[] intArray = {12,15,45,78,92,56,72};
	    Character[] charArray = {'S','L','U'};
	    
	    printArray(intArray);
	    printArray(charArray);
	}

}
