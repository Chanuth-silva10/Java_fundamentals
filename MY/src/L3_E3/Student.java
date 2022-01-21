package L3_E3;

public class Student {
     private  String name, ditno, address;
     
     public void setName(String name) {
    	 this.name = name;
    	 
     }
     public String getName() {
    	 return name;
     }
     public void setAddress(String name) {
    	 
    	 this.address = address;
    	 
     }
     public String getAddress() {
    	 return address;
     }
     public void setDit(String ditno) {
    	 
    	 this.ditno = ditno;
    	 
     }
     public String getDit() {
    	 return ditno;
     }
     
     public String getDetails() {
    	
    	 String r = "I am a Student.\nMy name is "+getName()+"\nI am form"+getAddress()+"\nMy dit no is "+getDit();
    	 return r;
     }
     
     
      
}

