package L6_E1;

public class MainApp {

	public static void main(String[] args) {
	  //object for Tablet class
		Tablet tab1 = new Tablet(101,"Maduka",5000,2,"Nokia","s3","13-megapixel");
		Tablet tab2 = new Tablet(101,"Chanith",1000,4,"Samsung","s4","18-megapixel");

		Vegitable veg1 = new Vegitable(2, "Barrer", 20, 94, false, 55);
		Vegitable veg2 = new Vegitable(4, "Carror", 10, 74, true, 41);

		IPrint arr[] = new IPrint[4];
		arr[0] = tab1;
		arr[1] = tab2;
		arr[2] = veg1;
		arr[3] = veg2;
		
		
		for(int i = 0; i<4; i++) {
			
			arr[i].printLine();
			
			
		}
		
		System.out.println(" ...................");
		
		for(int i = 0; i<4; i++) {
			arr[i].printDetails();
			System.out.println();
		}
		
	}

}
