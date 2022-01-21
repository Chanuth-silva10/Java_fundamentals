package pa;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Main{

	 public static void main(String[] args) {

	      int maxSubjects;
	      int [] marks = new int[5];
	      int total = 0;
	      double avg = 0;
	      
	      try {
	      // 1. Input a value for maxSubjects from keyboard
	            Scanner sc = new Scanner(System.in);
	            System.out.println("Enter the Max Subject: ");
	            maxSubjects = sc.nextInt();
	             
	      
	      // 2. Using a for loop input marks 
	            for(int i = 0; i<maxSubjects; i++) {
	            	
	            	System.out.println("Marks :");
	            	marks[i] = sc.nextInt();
	            	
	               
	      
	      // 3. Calculate the avg marks
	           
	            	total = total + marks[i];
	            
	            }
	            
	            avg = total/maxSubjects;
	            
	            System.out.println(avg);
	      // 4. Use a try catch block to prevent the following run time errors
	      
	            //   (a) Input valid integers to the inputs
	            }catch(InputMismatchException e) {
	            	System.out.println(e);
	            }
	  	        //   (b) ArithmeticException division by zero

	            catch(ArithmeticException e) {
	            	System.out.println(e);
	            }
	            
	            //   (c) ArrayIndexOutOfBounds Exception
	            catch(ArrayIndexOutOfBoundsException e) {
	            	System.out.println(e);
	            }
	      
	      catch (Exception e) {
	        System.out.println(e);
	      }
	      
	      finally {
	         System.out.println("This code will be gurrentied to run");
	      }
	    
	      System.out.println("The end");

	      
	
	  
  }
}
