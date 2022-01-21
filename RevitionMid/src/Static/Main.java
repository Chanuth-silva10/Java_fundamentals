package Static;

class Student{
	private String ditno;
	private String name;
	private static String batchId;//global variable
	
	public Student(String mditno,String mname,String mbatchId) {
		ditno = mditno;
		name = mname;
		batchId = mbatchId;
	}
	public void setBatchId(String mbatchId) {
		batchId = mbatchId;
	}
	
	public String getBatchId() {
		return batchId;
	}
	public void setDitNo(String mditno ) {
		ditno = mditno;
	}
	public String getDitNo() {
		return ditno;
	}
	public void setName(String mname){
		name = mname;
	}
	public String getName() {
		return name;
	}
	public void display() {
		System.out.println(ditno + "\t" + name + "\t" + batchId);
		
	}
	//static method
	//they only work with static
	public static void setBatch(String mbatchId) {
		batchId = mbatchId;
		//name = "SLIIT"; >>>> not static allow
	}
	
	static{
		System.out.println("Just running some static code");
	}
	
	
	
}

class Utility{
	public static int add(int no1,int no2) {
		return no1 + no2;
	}
}

class Demo{
	public Demo() {
		System.out.println("Demo Constructer");
	}
	static{
		System.out.println("Demo class loaded");
	}
	
}
public class Main {

	public static void main(String[] args) {
		int ans = Utility.add(34,60);
		System.out.println(ans);
		
		
		
            Student st1 = new Student("IT20145784","Amali","Malabe Batch 4" );
            Student st2 = new Student("IT20145787","vimali","Malabe Batch 4");
            Student st3 = new Student("IT20145745","Amali","Malabe Batch 4" );
            Student st4 = new Student("IT20145789","simali","Malabe Batch 4");
            
           //Student.setBatch("Malabe weekend Group ...... 4");//static method (Class.method)
            st1.display();
            st2.display();
            st3.display();
            st4.display();
            
           Demo d  = new Demo();
            
                  
	}

}
