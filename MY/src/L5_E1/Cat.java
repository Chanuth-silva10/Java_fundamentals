package L5_E1;

class Cat extends Animal {
	 
	 public Cat(String name) {
	 super(name);
	 }
	 
	//default constructer
	 public Cat() {
		 System.out.println("Cat constructor called");
	 }
	 
	 public String speak() {
		 
		return "Meow Meow";
	 }

}
	 