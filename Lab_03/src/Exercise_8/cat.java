package Exercise_8;

public class cat extends pet{
     private int livesLeft;

     public cat(String n, String o, int a,int l) {
       super(n, o, a);
       this.livesLeft = l;
}
     
     public cat(String n,String o) {
    	 super(n,o,0);
    	 this.livesLeft = 7;
     }
}//end of the pet class
