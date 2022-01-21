package ex_1;

public class StudentApp {

	public static void main(String[] args) {

		 Student s[] = new Student[5];
		 s[0] = new Student("Chanuth","IT","0774185595");
		 s[1] = new Student("Maduka","IT","0774178595" );
		 s[2] = new Student("Khanuth","SE","0914185595");
		 s[3] = new Student("Manuth","IT","0324185445");
		 s[4] = new Student("Kawiska","MS","0774457845");
        
		/*  s[0].print();
		  s[1].print();
		  s[2].print();
		  s[3].print();
		  s[4].print();*/
		  
		  for(int i = 0; i < 5; i++) {
			  s[i].print();
		  }
		 
	}

}
