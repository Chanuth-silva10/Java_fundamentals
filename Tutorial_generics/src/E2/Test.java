package E2;

public class Test {
	
	//imp1 swap method to swap the elements in 2 arrays
	private static<E> void swaparrays(E[] valarray1, E[] valarray2) {
		
		
		for(int i = 0; i<valarray1.length; i++) {
			E temp = valarray1[i];
			valarray1[i] = valarray2[i];
			valarray2[i] = temp;
			
		}
	}
	
	
    public static void main(String[] args) {
    	//Integer[] array1 = {10,11,12};
    	String[] array1 = {"a","b","c"};//change Integer,Double as anything all the datatype
    	String[] array2 = {"A","B","C"};
    	//Integer[] array2 = {20,21,22};
    	
    	for(int i = 0; i < array1.length; i++){
    		System.out.println("1st  Array [ " + i + " ]  " + array1[i]);
    	}
    	
    	for(int i = 0; i < array2.length; i++){
    		System.out.println("2nd  Array [ " + i + " ]  " + array2[i]);
    	}
    	
    	//call the swap method
    	swaparrays(array1,array2);
    	System.out.println("After swappilng...........");
    	
    	for(int i = 0; i < array1.length; i++){
    		System.out.println("1st  Array [ " + i + " ]  " + array1[i]);
    	}
    	
    	for(int i = 0; i < array2.length; i++){
    		System.out.println("2nd  Array [ " + i + " ]  " + array2[i]);
    	}
    	
    	
    }
}
