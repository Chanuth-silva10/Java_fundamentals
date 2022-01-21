package X;

public class Weekend implements RegisterInfo{
     
	WeekendStu w ;
	public void addDetails(String name, String address, String sex, int bYear, String spes, String jtitle) {
		w = new WeekendStu(name, address, sex, bYear, spes, jtitle);
		
	}

	public String generateID() {
		
		return null;
	}

	public void addMark(int marks1, int marks2, int marks3, int marks4, int marks5) {
		int marks[] = new int[5];
		marks[0] = marks1;
		marks[1] = marks2;
		marks[2] = marks3;
		marks[3] = marks4;
		marks[4] = marks5;
		
	}

	public void showDetails() {
		System.out.println("Student Name:"+w.getName());
		System.out.println("Student Address:"+w.getAddress());
		System.out.println("Student Gender:"+w.getSex());
		System.out.println("Student Year:"+w.getbYear());
		System.out.println("Student Specialization:"+w.getSpec());
		System.out.println("Student JobTitle:"+w.getJtitle());
	}

	
    
}
