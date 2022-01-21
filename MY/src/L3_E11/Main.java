package L3_E11;

public class Main {
	public static void main(String[] args){ 
		//Relevent 11 Q
	    Cat c = new Cat("Kyan", "Silva", 4, 4); 
		c.showDetails(); 
		//same 11
		Cat cnewborn = new Cat("Mickky","Chanuth");
		cnewborn.showDetails();
		
		Pet p = new Pet("Lissie","Smith",3); 
		p.showDetails(); 
		
		Pet pnewborn = new Pet("LissieChild","Maduka");
		pnewborn.showDetails();
		
		
		Dog d = new Dog("Tubbi", "Kumara", 12, 8);
		d.showDetails();
		
		Dog dnewborn = new Dog("TubbiChild", "C_kumara");
		dnewborn.showDetails();
	} 
}
