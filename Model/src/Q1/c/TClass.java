package Q1.c;

public class TClass extends Thread{
	private Calculation c;
	private int start;
	private int end;
	
	public TClass(Calculation c, int start, int end) {
		super();
		this.c = c;
		this.start = start;
		this.end = end;
	}

	public void run() {
		c.sum(start, end);
	}
}