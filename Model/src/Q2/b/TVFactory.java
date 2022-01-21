package Q2.b;

public class TVFactory extends AbstractFactory{

	public TV getTV(String type) {
		if(type.equalsIgnoreCase("ALPHA40")) {
			return new Alpha40("Alpha40", "21\'7\"");
		}
		else if(type.equalsIgnoreCase("GAMMA50")) {
			return new Gamma50("Gamma50", "22\"\5'");
		}
		else if(type.equalsIgnoreCase("THETA65")) {
			return new Theta65("Theta65", "23\"7\'");
		}
		else {
			return null;
		}
	}

	public MobilePhone getMobilePhone(String type) {
		return null;
	}
}