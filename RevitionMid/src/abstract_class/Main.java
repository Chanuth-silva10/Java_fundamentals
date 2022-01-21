package abstract_class;
//Abstract class
//you cant create objects of an abstract class
abstract class Shape{
	public Shape() {
		
	}
	abstract public int calcArea();
	// sub classes must implement them 
	
	
	
}

//class Square extends Shape{//error
	
//}

class Rectangle extends Shape{
	private int length;
	private int width;
	
	public Rectangle(int length,int width) {
		this.length = length;
		this.width = width;
		
	}
	public int calcArea() {
		return length * width;
	}
	
}

class Circle extends Shape{
	private int radious;
	public Circle(int radious) {
		this.radious = radious;
		
	}
	public int calcArea() {
		return (int)(Math.PI * radious * radious);
	}
	
}

public class Main {

	public static void main(String[] args) {
		//Shape s; can create objeec(Shape s = new Shape();)This is not valid
		Shape s ; // new Shape();
		s = new Circle(20);
		//SuperClass s = new SubClass();
		Rectangle r = new Rectangle(10,5);
		Circle c = new Circle(10);
		System.out.println(s.calcArea());
		System.out.println(r.calcArea());
		System.out.println(c.calcArea());
		
	}

}
