package X;

public class main {
    
	public static void main(String[] args) {
		Weekend student1=new Weekend();
        student1.addDetails("Jane","Malabe","F",1990,"DS","QA");
        String studentid = student1.generateID();
        student1.addMark(56,34,12,46,78);
        student1.showDetails();
        System.out.println("Student Id:"+studentid);
        System.out.println();
        
        Weekday student2=new Weekday();
        student2.addDetails("Jane","Malabe","F",1990,"DS","QA");
        String studentid2 = student2.generateID();
        student2.addMark(78,89,45,87,90);
        student2.showDetails();
        System.out.println("Student Id:"+studentid);
        System.out.println();
        
	}

}
