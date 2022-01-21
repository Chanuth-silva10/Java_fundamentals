package Q2.b;

public class ParallelThread extends Thread{
	Calculation myCalc;
	int start;
	int end;
	
	public ParallelThread(Calculation myCalc, int start, int end) {
		this.myCalc = myCalc;
		this.start = start;
		this.end = end;
	}
	
	public void run() {
		myCalc.Factorial(start, end);
	}
	
}