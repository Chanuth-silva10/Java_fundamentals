package Q4.b;

public class GarageGateOpen implements Command{
	GarageGate g;
	
	public GarageGateOpen(GarageGate g) {
		super();
		this.g = g;
	}

	public void execute() {
		g.open();
	}

}

