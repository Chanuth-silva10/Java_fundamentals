package L5_E1;

abstract public class Animal {
	 private String name;
	 
	 public Animal(String name) {
	 this.name = name;
	 }
	 
	 abstract public String speak();//no method body
	 
	 //default constructer
	 public Animal() {
		 System.out.println("Animal constructor called");
     }
	 
	 public void display() {
	 System.out.println("My name is " + this.name + ". " + this.speak() + ".");
	 
	 }
	
}