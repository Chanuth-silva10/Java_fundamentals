package Q2.b;

public class MobileFactory extends AbstractFactory{
	
	public MobilePhone getMobilePhone(String type) {
		if(type.equalsIgnoreCase("A10")) {
			return new A10("A10", 20000);
		}
		else if(type.equalsIgnoreCase("T25")) {
			return new T25("T25", 30000);
		}
		else if(type.equalsIgnoreCase("X25")) {
			return new X25("X25", 40000);
		}
		else {
			return null;
		}
	}

	
	public TV getTV(String type) {
		return null;
	}
}