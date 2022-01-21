package E2;

public class Demo {

	public static void main(String [] args) {
		Print print = new Print();
		int age = 24;
	    print.print("Age is",age);
	    String name = "Amal";
	    print.print("Name is", name);
	    boolean isOn = false;
	    print.print("Is light on", isOn);
	}
	

     
}

class Print{
	<T>  void print(String message,T val) {
		System.out.println(message + ":" + val);
	}
}
