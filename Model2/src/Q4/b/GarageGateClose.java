package Q4.b;

public class GarageGateClose implements Command{
	GarageGate g;
		
	public GarageGateClose(GarageGate g) {
		super();
		this.g = g;
	}

	public void execute() {
		g.close();
	}
}