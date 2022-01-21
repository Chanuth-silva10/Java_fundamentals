package Singelton;

public class WashingMachine {
      private WashingMachine() {}
    	  private static WashingMachine instance = new WashingMachine();
    	  
    	  public static WashingMachine getInstance() {
    		  return instance;
    	  }
    	  
    	  
      public void showMessage() {
    	  System.out.println("I am the singelton object");
      }
      
}
