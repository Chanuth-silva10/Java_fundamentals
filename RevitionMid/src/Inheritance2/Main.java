package Inheritance2;


class Person{
	public Person() {
		System.out.println("Person default constructor");
		
	}
	public Person(int para1) {
		System.out.println("Person overloaded constructer ");
	}
}
class Student extends Person {
	public Student() {
		System.out.println("Student default constructer");
	}
	public Student(int para1,int para2) {
		super(para1);
		System.out.println("Studennt overloaded constructer");
	}
}
class PostGraduate extends Student {
	public PostGraduate() {
		System.out.println("PostGraduate default constructer");
	}
	public PostGraduate(int para1,int para2,int para3) {
		super(para1,para2);
		System.out.println("PostGraduate overloaded constructer");
	}
}
public class Main {

	public static void main(String[] args) {
		//PostGraduate p = new PostGraduate();
		PostGraduate p2 = new PostGraduate(1,2,3);


	}

}
