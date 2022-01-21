package T4_E1;
import java.util.Scanner;
public class Book implements IDisplay,IInput{
    private String bookID, title, publisher;
    
    

	@Override
	public void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter BookID :");
		this.bookID = s.nextLine();
		System.out.print("Enter Book Title :");
		this.title = s.nextLine();
		System.out.print("Enter Book Publisher :");
		this.publisher = s.nextLine();
	}

	@Override
	public void print() {
		System.out.println("BookID : "+this.bookID+"Title :"+this.title+"Publisher :"+this.publisher);
		
	}

	@Override
	public void printDetails() {
		System.out.println("BookID : "+this.bookID);
		System.out.println("Title :"+this.title);
		System.out.println("Publisher :"+this.publisher);
		
	}
	
}
