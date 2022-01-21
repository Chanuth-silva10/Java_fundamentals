package T2_E2;

public class Point3D {
      
	  private double  p1,p2,p3;
      private double dis = 0;
      public Point3D(double p1, double p2, double p3) {
    	  this.p1 = p1;
    	  this.p2 = p2;
    	  this.p3 = p3;
      }
      
      public void calculate() {
    	  
    	  dis = Math.sqrt((p1 * p1) + (p2 * p2 )+ (p3 * p3));
    	  
      }
      
      public void dispaly() {
    	  System.out.println("Distance is  :"+ dis);
      }
}
