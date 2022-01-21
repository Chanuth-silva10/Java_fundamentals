package Q4.b;

public class MainApp {

	public static void main(String[] args) {
		MobileUI m = new MobileUI();
		Oven mainOven = new Oven("mainOven");
		GarageGate garageGate = new GarageGate("garageGate");
		
		OvenOn onMainOven = new OvenOn(mainOven);
		OvenOff offMainOven = new OvenOff(mainOven);
		GarageGateOpen openGarageGate = new GarageGateOpen(garageGate);
		GarageGateClose closeGarageGate = new GarageGateClose(garageGate);
		
		m.setCommand(0, onMainOven);
		m.setCommand(1, offMainOven);
		m.setCommand(2, openGarageGate);
		m.setCommand(3, closeGarageGate);
		
		m.commandPressed(0);
		m.commandPressed(1);
		m.commandPressed(2);
		m.commandPressed(3);
	}

}