package Interfaces;

interface IDisplay{
	void display();
	void dispalyDetails();
}

class Person implements IDisplay{
	private String name;
	private String mobileNo;
	public Person(String name, String mobileNo) {
		this.name = name;
		this.mobileNo = mobileNo;
	}
	public void display() {
		System.out.println(name+"\t"+ mobileNo);
		
	}
	public void dispalyDetails() {
		System.out.println("Name = "+name+ "Mobile No ="+mobileNo);
		
	}
	
}
class Book implements IDisplay{
	private String title;
	private String author;
	public Book(String title,String author) {
		this.title = title;
		this.author = author;
	}
	public void display() {
		System.out.println(title+"\t"+ author);
		
	}
	
	@Override
	public void dispalyDetails() {
		System.out.println("Title = "+title+ "Author ="+author);

		
	}
	public void calc() {
		System.out.println("Computation is been carried out");
	}
}
public class Main {

	public static void main(String[] args) {
		Book bk  = new Book("Star Wars","George Lucas");
		Person p = new Person("Chanuth", "01245785");
		bk.display();
		p.display();
		bk.dispalyDetails();
		p.dispalyDetails();
		
		//Class classname = new Class();
		//Interface ivar = new  Class();
		//Any class that implements that interface
		IDisplay id = new Book("Famous Five", "Enid Blyton");
		IDisplay id2 = new Person("Indika", "0147851154");
		id.display();
		id2.display();
		//id.calc();not allow
		Book bk2 = (Book) id; 
		bk2.calc();
		
		IDisplay objs[] = new IDisplay[2];
		objs[0] = bk;
		objs[1] = p;
		for(int r = 0; r<2; r++) {
			objs[r].dispalyDetails();
		}
		

	}

}
