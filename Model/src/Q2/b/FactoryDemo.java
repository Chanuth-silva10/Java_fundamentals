package Q2.b;

public class FactoryDemo {

	public static void main(String[] args) {
		AbstractFactory af = FactoryProducer.getFactory("mobilephone");
		MobilePhone mp = af.getMobilePhone("a10");
		mp.display();
		
		FactoryProducer.getFactory("mobilephone").getMobilePhone("t25").display();
		FactoryProducer.getFactory("mobilephone").getMobilePhone("x25").display();
		
		FactoryProducer.getFactory("tv").getTV("alpha40").display();
		FactoryProducer.getFactory("tv").getTV("gamma50").display();
		FactoryProducer.getFactory("tv").getTV("theta65").display();
	}
}
