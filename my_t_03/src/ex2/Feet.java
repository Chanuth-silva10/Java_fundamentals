package ex2;

public class Feet {

     private int feet;
     private int inches;
     
     public Feet(int feet,int inches) {
    	 this.feet = feet;
    	 this.inches = inches;
     }
     //overloaded
     public Feet(Feet len) {
         this.feet = len.feet;
         this.inches = len.inches;
     }
     
     public void add(Feet f1,Feet f2) {
    	int totFeet = f1.feet + f2.feet;
    	int totinches = f1.inches + f2.inches;
    	int restOfFeet = totinches % 12;
    	totFeet = totFeet  + restOfFeet;
    	totinches = totinches / 12;
    	this.feet = totFeet;
    	this.inches = totinches;
    	
     }
     public void print() {
    	 System.out.println(this.feet+"' "+this.inches+"\"");
     }
     //overloaded
     public void print(String msg) {
    	 System.out.println(msg+this.feet+"' "+this.inches+"\"");
     }
     
     public static void print(Feet f) {
    	 System.out.println(f.feet +"'"+f.inches+"\"");
     }
     public static Feet add(Feet f1,Feet f2,Feet f3) {
    	int totFeet = f1.feet + f2.feet +f3.feet;
     	int totinches = f1.inches + f2.inches + f3.inches;
     	Feet r1 = new Feet(totFeet,totinches);
     	return r1;
     }
}  