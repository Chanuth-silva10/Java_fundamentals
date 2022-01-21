package Exercise_8;

public class Main {
public static void main(String[] args){
    pet p = new pet("Lissie","Smith",3);
    p.showDetails();
    
    //call overloaded constructor for new born pet
	  pet p1 = new pet("Kittiya","Ann");
	  p1.showDetails();
    
    cat c = new cat("Kyan", "Silva", 4, 4);
    c.showDetails();
    
    //call overloaded constructor for new born pet
    cat c1 = new cat("Tommy", "Jerry");
    c.showDetails();
    
    
    
    Dog d = new Dog("Blacky","Saman",6,2);
    d.showDetails();
    
    //call overloaded constructor for new born pet
    Dog d1 = new Dog("Brown","Kasun");
    d1.showDetails();
    
}

}//end of the demo class
