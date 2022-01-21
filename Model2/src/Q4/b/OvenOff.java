package Q4.b;

public class OvenOff implements Command{
	
	Oven o;
	
	public OvenOff(Oven o) {
		super();
		this.o = o;
	}

	public void execute() {
		o.off();
	}

}