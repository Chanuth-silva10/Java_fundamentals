package Multiple_Parameters;

 class  TwoGen<T,V>{
	T ob1;
	V ob2;
	
	TwoGen(T o1, V o2){
		ob1 = o1;
		ob2 = o2;
	}
	
	void ShowType() {
		System.out.println("Type of T is "+ob1.getClass().getName());
		System.out.println("Type of V is "+ob2.getClass().getName());
		
	}
	
	T getob1() {
		return ob1;
	}
	
	V getob2() {
		return ob2;
	}
}
public class GenExample {

	public static void main(String[] args) {
		TwoGen<Integer, String>  tgob = new TwoGen<Integer, String>(123,"Anne");
		
		tgob.ShowType();
		
		int v = tgob.getob1();
		System.out.println("Value is :"+v);
		
		String s = tgob.getob2();
		System.out.println("Value is :"+s);
		
	}
		
	}


