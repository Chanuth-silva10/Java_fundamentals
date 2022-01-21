package lab05Pack;

abstract public class Animal {
	 private String name;
	 
	 public Animal(String name) {
	     this.name = name;
	 }
	 
	 abstract public String speak();//no metod body
	 
	 
	 public Animal() {
		 System.out.println("Animal constructor called");
	 }
	 
	 public void display() {
	     System.out.println("My name is " + this.name + ". " + this.speak() + ".");
	 }
	 
	}