package E1;

import java.util.Scanner;

public class Book implements IDisplay,IInput{
   
	private String bookID,title,publisher;
     
	
    public void print() {
    	System.out.println("Book ID :"+this.bookID+"Title :"+this.title+"Publisher :"+publisher);
    }

	@Override
	public void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter BookID :");
		this.bookID = s.nextLine();
		System.out.print("Enter Title :");
		this.title = s.nextLine();
		System.out.print("Enter Publisher :");
		this.publisher = s.nextLine();
		
	}

	@Override
	public void printDetails() {
		System.out.println("Book Id :"+this.bookID);
		System.out.println("Title :"+this.title);
		System.out.println("Publisher :"+this.publisher);
	}
	
}
