package lab05Pack;

class Dog extends Animal {
	
	 public Dog(String name) {
	 super(name);
	 }
	 
	 public Dog() {
		 System.out.println("Dog constructor called");
	 }
	 
	 public String speak() {
	 return "Bow Wow";
	 }
}