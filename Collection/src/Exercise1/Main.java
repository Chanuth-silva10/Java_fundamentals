package Exercise1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 listGenericTotal(addElementGenericArray());
	}
	
public static List<Integer> addElementGenericArray(){
	
	//creating a List of type Integer using ArrayList
	List<Integer> list = new ArrayList<Integer>();
	
	//Add the elements to the array list
	Scanner sc = new Scanner(System.in);
	
	if(list.isEmpty() == true)
		System.out.println("List cannot be empty..");
	
	System.out.println("Please Enter values for the list :");
	for(int i = 0; i < 5; i++) {
		System.out.println("enter value "+ (i + 1));
		list.add(sc.nextInt());
	}
	
	return list;
}
 
//Getting the total
 public static void listGenericTotal(List<Integer> list) {
	  
	 int total = 0;
	 for(Integer x : list) {
		 total += x;
	 }
	 System.out.println("Total is  = "+ total);
	 
 }
	

}
