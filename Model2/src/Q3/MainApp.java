package Q3;

public class MainApp {

	public static void main(String[] args){
		Student s = new Student(101, "Imal");
		
		s.input();
		System.out.println("Average : " +s.getAverage());
	}
}
