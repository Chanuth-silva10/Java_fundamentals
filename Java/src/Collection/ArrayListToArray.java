package Collection;
import java.util.ArrayList;
public class ArrayListToArray {

	    public static void main(String args[]) {     // Create an array list.     
	        ArrayList<Integer> al = new ArrayList<Integer>();

	        // Add elements to the array list.     
	        al.add(10);
	        al.add(20);
	        al.add(30);
	        al.add(40);

	        System.out.println("Contents of al: " + al);

	        // Get the array.    
	        Integer ia[] = new Integer[al.size()];
	        ia = al.toArray(ia);

	        int sum = 0;

	        // Sum the array.     
	        for (int i = 0; i < ia.length; i++) {
	            sum += ia[i];
	        }

	        System.out.println("Sum is: " + sum);
	    }

	}

