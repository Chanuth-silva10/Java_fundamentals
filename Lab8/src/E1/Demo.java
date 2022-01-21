package E1;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {2,4,1,8,12,3,4,8,9,21};
		Sort sort = new Sort();
		//sort.bubbleSort(arr);
		
		for(int i = 0; i < 10; i++) {
			System.out.println(arr[i]);
		}
		Float[] arr2 = {2.3f, 5f, 4.5f, 5.4f, 8.9f, 7.4f, 2.5f, 6.8f, 1.7f, 9f};
       // sort.bubbleSort(arr2);
        SortGen<Float> sortFloat = new SortGen<Float>();
        sortFloat.bubbleSort(arr2);
        
        System.out.println("Sorted float array");
        for(int i = 0; i < 10; i++) {
			System.out.println(arr2[i]);
		}
        
       Double[] arr3 = {1.2, 3.5, 3.3, 6.5, 6.9, 7.3, 1.2, 3.6, 9.7, 9.8};
       // sort.bubbleSort(arr3);
        SortGen<Double> sortDouble = new SortGen<Double>();
        sortDouble.bubbleSort(arr3);
        
        System.out.println("Sorted double array");
        for(int i = 0; i < 10; i++) {
			System.out.println(arr3[i]);
		}
        
        
        //use gen Method
        SortGen2 sortGen2 = new SortGen2();
        sortGen2.bubbleSort(arr2);
        sortGen2.bubbleSort(arr3);
        sortGen2.bubbleSort(arr);
        
	}

}
