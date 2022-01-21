package ex2;

public class MyMain {

	public static void main(String[] args) {
		Feet.print( new Feet(3,4));//static 
		
		Feet s1 = new Feet(4,5);
		Feet s2 = new Feet(4,5);
		Feet s3 = new Feet(4,5);
		
		Feet f5 =   Feet.add(s1,s2,s3);
		System.out.println("All feet is :"+f5);
		Feet ob1= new Feet(5,6);
		Feet ob2= new Feet(6,7);
		Feet newob = new Feet(0,0);
		newob.add(ob1,ob2);
		newob.print();
		newob.print("Length :");
		
    }
}