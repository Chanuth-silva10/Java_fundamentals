package T3_E2;

public class Feet {
	private int feet;
	private int inches;
	// Copy the content of len to the new Feet Object.
    public Feet(Feet len) {
		
	}

	public Feet(int feet, int inches){}
	// Add f1+f2 feet and store in current feet
	
	public void add(Feet f1, Feet f2){}
	// Display a Length e.g 5’6”
	
	public void print() {} 
	//Overloaded Constrcter
	
	public void print(String len) {
		System.out.println(len+""+this.feet+"' "+this.inches);
	} 
}
