package L3_E8;

public class Pet {
	protected String name;
	protected String owner;
	protected int age;
	
	//Overloaded constructer
	public Pet(String n, String o) {
		this.name = n;
		this.owner = o;
		this.age = 0;
	}
	public Pet(String n, String o, int a) {
		this.name = n;
		this.owner = o;
		this.age = a;
	}
	public void showDetails(){
	System.out.println("I am a pet. My name is "+this.name+". My owner is "+this.owner+" My age is : "+this.age);
	}
}

