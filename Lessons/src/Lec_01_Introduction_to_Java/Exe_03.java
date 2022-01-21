package Lec_01_Introduction_to_Java;
import java.util.Scanner;
public class Exe_03 {

   public static void main(String args[]) {
	   int m1,m2,m3;
	   System.out.println("Enter numbers");
	   Scanner s = new Scanner(System.in);
	   m1 = s.nextInt();
	   m2 = s.nextInt();
	   m3 = s.nextInt();
	   
	   if(m1>m2) {
		   if(m1>m3) {
		   System.out.println("Max is :"+m1);
		   }else 
			   System.out.println("Max is :"+m3);
		      System.out.println("Min is :"+m2);

	   }else {
		   if(m2>m3) {
			   System.out.println("Max is :"+m2);
		   }else
			   System.out.println("Max is :"+m3);
	   }
	   if(m1<m2) {
		   if(m1<m3) {
		   System.out.println("Min is :"+m1);
		   }else 
			   System.out.println("Max is :"+m3);
		      

	   }else {
		   if(m2<m3) {
			   System.out.println("Max is :"+m2);
		   }else
			   System.out.println("Max is :"+m3);
	   }
	   
   }
}
