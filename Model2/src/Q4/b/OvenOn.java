package Q4.b;

public class OvenOn implements Command{

	Oven o;
	
	public OvenOn(Oven o) {
		super();
		this.o = o;
	}

	public void execute() {
		o.on();
	}
	
}