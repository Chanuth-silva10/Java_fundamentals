package main;

public interface StudentRegistration {

    public void addDetails(String name,String address,String sex,int bornYear,String specialization,String specialAttribute);

    public String generateID() ;

    public void addMark(int mark1,int mark2,int mark3,int mark4,int mark5);

    public void showDetails();
}
