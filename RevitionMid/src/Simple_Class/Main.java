//Creating a Person Class in Java with the follwing 
//name and mobileno as properties

//Topics Covered
//1. Implementing a class
//2. Constructor
//     Default
//     Overloaded
//3.Getters/Setters
//4.Creating Object


package Simple_Class;

class Person{
	private String name;
	private String mobileNo;
	
	Person() {
		mobileNo = "0711234562";
		name  = "";
	}
	public Person(String name, String mobileNo) {
		this.name = name;
		this.mobileNo = mobileNo;

	}
	public String getName(){
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNo(){
		return this.mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public void display() {
		System.out.println("Name :" + this.name +"Mobile No :"+mobileNo);
		
	}
	
}

public class Main {

	public static void main(String[] args) {
		
		
		Person p1 = new Person("Chanuth","0123456789" );
		Person p2 = new Person("Madduka","0124578963");
		p1.display();
		p2.display();
		Person p3 = new Person();
		p3.display();
		p3.setMobileNo("017896545");
		p3.setName("Sada");
		p3.display();
		
		
		

	}

}
