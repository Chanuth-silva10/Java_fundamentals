package X;

public interface RegisterInfo {
	public void addDetails(String name, String address, String sex, int bYear, String spes, String jtitle); 

	public String generateID(); 

	public void addMark(int marks1, int marks2, int marks3, int marks4, int marks5); 

	public void showDetails(); 
}
