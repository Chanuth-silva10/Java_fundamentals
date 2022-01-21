package Lec_01_Introduction_to_Java;
import java.util.Scanner;
public class Exe_04 {
  public static void main(String args[]) {
	int count = 0,no;
	Scanner s = new Scanner(System.in);
	while(count < 10) {
		no = s.nextInt();
		if(no % 2 == 0) {
			System.out.println("Even number :"+no);
		}else {
			System.out.println("Odd number :"+no);
		}
		count++;
	}
	
}
}
