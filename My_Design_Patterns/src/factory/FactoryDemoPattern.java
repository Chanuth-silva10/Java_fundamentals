package factory;

public class FactoryDemoPattern {

	public static void main(String[] args) {
		
		PhoneFactory phonefactory = new PhoneFactory();
		
		Phone myPhone = phonefactory.getPhone("Low Price");
		myPhone.showSpec();
	}

}
