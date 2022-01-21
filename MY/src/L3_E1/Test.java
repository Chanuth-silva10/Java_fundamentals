package L3_E1;

public class Test {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.name = "Chanuth";
		s1.ditno = "IT1010";
		s1.address = "Galle";
		s2.name = "Mhanuth";
		s2.ditno = "ST1010";
		s2.address = "Kandy";
		
		System.out.println("Name :"+s1.name+"\tAddress :"+s1.address+"\tDitno :"+s1.ditno);
		System.out.println("Name :"+s2.name+"\tAddress :"+s2.address+"\tDitno :"+s2.ditno);


	}

}
