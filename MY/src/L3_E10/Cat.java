package L3_E10;

public class Cat extends Pet {
	private int livesLeft;
	public Cat(String n, String o) {
		super(n,o);
		this.age = 0;
		this.livesLeft = 7;
	}
	public Cat(String n, String o, int a, int l) {
		super(n, o, a);
		this.livesLeft = l;
	}
}


