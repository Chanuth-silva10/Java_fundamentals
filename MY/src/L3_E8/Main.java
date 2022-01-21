package L3_E8;

public class Main {
	public static void main(String[] args){ 
		Pet p = new Pet("Lissie","Smith",3); 
		p.showDetails(); 
		
		Pet pnewborn = new Pet("LissieChild","Maduka");
		pnewborn.showDetails();
		
		Cat c = new Cat("Kyan", "Silva", 4, 4); 
		c.showDetails(); 
		
		Cat cnewborn = new Cat("Mickky","Chanuth");
		cnewborn.showDetails();
		
		
	} 
}
