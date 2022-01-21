package Singelton;

public class SingletonDemo {

	public static void main(String[] args) {
		WashingMachine wm = WashingMachine.getInstance();
		wm.showMessage();
	}

}
