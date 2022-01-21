package Exercise_1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();
		s1.name = "Chanuth";
		s1.dit  = "IT2233";
		s1.address = "Colombo";
		
		Student s2 = new Student();
		s2.name = "Maduka";
		s2.dit  = "SE2233";
		s2.address  = "hajajaj";
		
		//Student s1 = new Student("Kamal","IT1365","Colombo");
		//Student s2 = new Student("Nimal","IT2145","Badulla");
		
		
		//System.out.println("Name : "+s1.name +"\nDIT Number :" + s1.dit + "\nAddress : "+s1.address +"\n" );
	//	System.out.println("Name : "+s2.name +"\nDIT Number :" + s2.dit + "\nAddress : "+s2.address +"\n" );
		System.out.println(s1.getDetails());
		System.out.println(s2.getDetails());

	}

}
