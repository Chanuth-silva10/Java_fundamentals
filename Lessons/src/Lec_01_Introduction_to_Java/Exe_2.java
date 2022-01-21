package Lec_01_Introduction_to_Java;
import java.util.Scanner;

public class Exe_2{
	
	public static void main(String args[]){
	    int width,length,perimeter;
	    Scanner s = new Scanner(System.in);
		System.out.print("Enter Rectangle Width :");
		width = s.nextInt();
		System.out.print("Enter Rectangle Length :");
		length = s.nextInt();
		perimeter = 2 *(width + length);
		System.out.println("Perimiter is : "+ perimeter);
		
		
	}
	
}
