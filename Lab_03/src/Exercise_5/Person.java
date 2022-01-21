package Exercise_5;

public class Person {

	String name,address;
	
	public Person(String newName,String newAddress) {
		
		name = newName;
		address = newAddress;
	}
	void showDetails(){
		System.out.println("My name is" +name+"\n I am from"+address+"\n");
	}
}
