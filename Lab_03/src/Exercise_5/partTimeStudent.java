package Exercise_5;

public class partTimeStudent extends Student {
    int noOfHrs;
  public partTimeStudent(String newName, String newAddress, String newstudentid,int newnoOfHrs) {
      super(newName, newAddress, newstudentid);
      noOfHrs = newnoOfHrs;
  }
    @Override
  void showDetails(){
      super.showDetails();
        System.out.println("My working hourse are "+ noOfHrs);
  }
    
   
}
