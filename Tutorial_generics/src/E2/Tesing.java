package E2;

public class Tesing {
	
	//imp1 swap method to swap the elements in 2 arrays
	private static void swaparrays(Integer[] valarray1, Integer[] valarray2) {
		
		
		for(int i = 0; i<valarray1.length; i++) {
			int temp = valarray1[i];
			valarray1[i] = valarray2[i];
			valarray2[i] = temp;
			
		}
	}
	
	
    public static void main(String[] args) {
    	Integer[] array1 = {10,11,12};
    	Integer[] array2 = {20,21,22};
    	
    	for(int i = 0; i < array1.length; i++){
    		System.out.println("1st  Array [ " + i + " ]  " + array1[i]);
    	}
    	
    	for(int i = 0; i < array2.length; i++){
    		System.out.println("2nd  Array [ " + i + " ]  " + array2[i]);
    	}
    	
    	//call the swap method
    	swaparrays(array1,array2);
    	System.out.println();
    	
    	for(int i = 0; i < array1.length; i++){
    		System.out.println("1st  Array [ " + i + " ]  " + array1[i]);
    	}
    	
    	for(int i = 0; i < array2.length; i++){
    		System.out.println("2nd  Array [ " + i + " ]  " + array2[i]);
    	}
    	
    	
    }
}
