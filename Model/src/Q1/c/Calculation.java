package Q1.c;

public class Calculation {
	private int total;
	
	public void sum(int start, int end) {
		for(int i = start; i <= end; i++) {
			total = total + i;
		}
	}
	
	public int getTotal() {
		return total;
	}
}