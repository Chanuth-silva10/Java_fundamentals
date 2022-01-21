package Collection;
import java.util.ArrayList;
public class ForEachExample {
	

	    public static void main(String[] args) {
	        ArrayList<String> items = new ArrayList<>();
	        items.add("A");
	        items.add("B");
	        items.add("C");
	        items.add("D");
	        items.add("E");

	        for (String item : items) {
	            System.out.println(item);
	        }
	    }

	}

