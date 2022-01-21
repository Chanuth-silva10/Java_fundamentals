package L5_E1;

class Dog extends Animal {
	 public Dog(String name) {
	 super(name);
	 }
	 
	//default constructer
	 public Dog() {
		 System.out.println("Dog constructor called");
	
	 }
	 
	 public String speak() {
	 return "Bow Wow";
	 }

}