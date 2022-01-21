package Q2.b;

public class FactoryProducer {

	public static AbstractFactory getFactory(String type) {
		if(type.equalsIgnoreCase("MOBILEPHONE")) {
			return new MobileFactory();
		}
		else if(type.equalsIgnoreCase("TV")) {
			return new TVFactory();
		}
		else {
			return null;
		}
	}
}