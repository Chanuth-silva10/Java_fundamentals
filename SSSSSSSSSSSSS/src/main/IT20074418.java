IT20074418
DE SILVA C.M.K
Group 9.1




/*..................StudentRegistration.java.......................*/

package main;

public interface StudentRegistration {

    public void addDetails(String name,String address,String sex,int bornYear,String specialization,String specialAttribute);

    public String generateID() ;

    public void addMark(int mark1,int mark2,int mark3,int mark4,int mark5);

    public void showDetails();
}
/*.................StudentSpecialization.java..........................*/

package main;


public interface StudentSpecialization {

    public void addSpecialization(String specialization,double GPA);

}
/*.................Weekday.java..........................................*/

package main;

import java.util.ArrayList;
import java.util.Random;


public class Weekday implements StudentRegistration{

    public static ArrayList<WeekDayStudent> weekDayStudents = new ArrayList<>();
    public static String studentName;
    public static String studentID;

    public void addDetails(String name, String address, String sex, int bornYear, String specialization, String specialAttribute) {

        studentName = name;

        WeekDayStudent weekDayStudent = new WeekDayStudent();
        weekDayStudent.setName(name);
        weekDayStudent.setAddress(address);
        weekDayStudent.setSex(sex);
        weekDayStudent.setBornYear(bornYear);
        weekDayStudent.setSpecialization(specialization);
        weekDayStudent.setFreeDay(specialAttribute);

        weekDayStudents.add(weekDayStudent);
    }


    public String generateID() {
        Random random = new Random();
        int newID = random.nextInt(100000);

        int count = 0;
        int num = newID;

        boolean flag = true;

        while (flag) {
            while(num != 0 ){
                num = num/10;
                count++;
            }

            if(count < 4){
                try {
                    throw new IDInvalidException("ID is Invalid");
                } catch (IDInvalidException e) {
                    e.printStackTrace();
                    newID = random.nextInt(100000);
                }
            }else {
                flag = false;
            }
        }

        String id = "IT"+newID;

        studentID = id;

        for (WeekDayStudent weekDayStudent : weekDayStudents) {
            if(weekDayStudent.getName().equals(studentName)){
                weekDayStudent.setId(id);
                break;
            }
        }

        return id;
    }

    public void addMark(int mark1, int mark2, int mark3, int mark4, int mark5) {
        int[] marks = new int[5];
        marks[0] = mark1;
        marks[1] = mark2;
        marks[2] = mark3;
        marks[3] = mark4;
        marks[4] = mark5;

        for (WeekDayStudent weekDayStudent : weekDayStudents) {
            if(weekDayStudent.getId().equals(studentID)){
                weekDayStudent.setMarks(marks);
                break;
            }
        }
    }

    public void showDetails() {
        for (WeekDayStudent weekDayStudent : weekDayStudents) {
            if(weekDayStudent.getId().equals(studentID)){
                System.out.println("Student name "+weekDayStudent.getName());
                System.out.println("Student address "+weekDayStudent.getAddress());
                System.out.println("Gender "+weekDayStudent.getSex());
                System.out.println("Student year "+weekDayStudent.getBornYear());
                System.out.println("Student Specialization "+weekDayStudent.getSpecialization());
                System.out.println("Student Job Title "+weekDayStudent.getFreeDay());
                break;
            }
        }
    }
}
/*......................WeekDayStudent.java..........................*/

package main;


public class WeekDayStudent {
    private String id;
    private String name;
    private String address;
    private String sex;
    private int bornYear;
    private String specialization;
    private String freeDay;
    private int[] marks;

    public WeekDayStudent(String id, String name, String address, String sex, int bornYear, String specialization, String freeDay, int[] marks) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.sex = sex;
        this.bornYear = bornYear;
        this.specialization = specialization;
        this.freeDay = freeDay;
        this.marks = marks;
    }

    public WeekDayStudent() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getBornYear() {
        return bornYear;
    }

    public void setBornYear(int bornYear) {
        this.bornYear = bornYear;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getFreeDay() {
        return freeDay;
    }

    public void setFreeDay(String freeDay) {
        this.freeDay = freeDay;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public int[] getMarks() {
        return marks;
    }
}

/*.................Weekend.java............................*/

package main;

import java.util.ArrayList;
import java.util.Random;

public class Weekend implements StudentRegistration{

    public static ArrayList<WeekEndStudent> weekEndStudents = new ArrayList<>();
    public static String studentName;
    public static String studentID;

    public void addDetails(String name, String address, String sex, int bornYear, String specialization, String specialAttribute) {

        studentName = name;

        WeekEndStudent weekEndStudent = new WeekEndStudent();
        weekEndStudent.setName(name);
        weekEndStudent.setAddress(address);
        weekEndStudent.setSex(sex);
        weekEndStudent.setBornYear(bornYear);
        weekEndStudent.setSpecialization(specialization);
        weekEndStudent.setJobTitle(specialAttribute);

        weekEndStudents.add(weekEndStudent);
    }


    public String generateID() {
        Random random = new Random();
        int newID = random.nextInt(10000);

        int count = 0;
        int num = newID;

        boolean flag = true;

        while (flag) {
            while(num != 0 ){
                num = num/10;
                count++;
            }

            if(count < 4){
                try {
                    throw new IDInvalidException("ID is Invalid");
                } catch (IDInvalidException e) {
                    e.printStackTrace();
                    newID = random.nextInt(100000);
                }
            }else {
                flag = false;
            }
        }

        String id = "IT"+newID;
        studentID = id;
        for (WeekEndStudent weekEndStudent : weekEndStudents) {
            if(weekEndStudent.getName().equals(studentName)){
                weekEndStudent.setId(id);
                break;
            }
        }

        return id;
    }

    public void addMark(int mark1, int mark2, int mark3, int mark4, int mark5) {
        int[] marks = new int[5];
        marks[0] = mark1;
        marks[1] = mark2;
        marks[2] = mark3;
        marks[3] = mark4;
        marks[4] = mark5;

        for (WeekEndStudent weekEndStudent : weekEndStudents) {
            if(weekEndStudent.getId().equals(studentID)){
                weekEndStudent.setMarks(marks);
                break;
            }
        }
    }

    public void showDetails() {
        for (WeekEndStudent weekEndStudent : weekEndStudents) {
            if(weekEndStudent.getId().equals(studentID)){
                System.out.println("Student name "+weekEndStudent.getName());
                System.out.println("Student address "+weekEndStudent.getAddress());
                System.out.println("Gender "+weekEndStudent.getSex());
                System.out.println("Student year "+weekEndStudent.getBornYear());
                System.out.println("Student Specialization "+weekEndStudent.getSpecialization());
                System.out.println("Student Job Title "+weekEndStudent.getJobTitle());
                break;
            }
        }
    }
}
/*....................WeekEndStudent.java.....................*/

package main;

public class WeekEndStudent {
    private String id;
    private String name;
    private String address;
    private String sex;
    private int bornYear;
    private String specialization;
    private String jobTitle;
    private int[] marks;

    public WeekEndStudent() {
    }

    public WeekEndStudent(String id, String name, String address, String sex, int bornYear, String specialization, String jobTitle, int[] marks) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.sex = sex;
        this.bornYear = bornYear;
        this.specialization = specialization;
        this.jobTitle = jobTitle;
        this.marks = marks;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getBornYear() {
        return bornYear;
    }

    public void setBornYear(int bornYear) {
        this.bornYear = bornYear;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public int[] getMarks() {
        return marks;
    }
}
/*..................Enroll.java......................*/
package main;

import java.util.HashMap;

public class Enroll implements EnrollStudent{

    public static HashMap<String,String> enrolledStudents = new HashMap<>();

    public void enrollStudent(String studentID, String specialization) {
        enrolledStudents.put(studentID,specialization);
    }


    public void displayEnrolledStudentDetails() {
        for (String key : enrolledStudents.keySet()) {
             System.out.println(key + " : " + enrolledStudents.get(key));
        }
    }
}


/*.........................EnrollStudent.java...............*/

package main;

public interface EnrollStudent {

    public void enrollStudent(String studentID,String specialization);

    public void displayEnrolledStudentDetails();
}

/*.................IDInvalidException.java....................*/
package main;

public class IDInvalidException extends Exception{

    IDInvalidException(String exception){
        super(exception);
    }

}
/*....................Main.java................................*/

package main;

public class Main {
    public static void main(String[] args) {
        Weekend student1 = new Weekend();
        student1.addDetails("Jane","Malabe","F",1990,"DS","QA");
        String studentid = student1.generateID();
        student1.addMark(56,34,12,46,78);
        student1.showDetails();
        System.out.println("Student ID "+studentid);
        System.out.println();


        Weekday student2 = new Weekday();
        student2.addDetails("Jim","Kaluthara","M",1991,"SE","TuesDay");
        String studentid2 = student2.generateID();
        student2.addMark(78,89,45,87,90);
        student2.showDetails();
        System.out.println("Student ID "+studentid2);
        System.out.println();

        Enroll sem1 = new Enroll();
        sem1.enrollStudent(studentid,"IT");
        sem1.enrollStudent(studentid2,"SE");
        System.out.println("\n\n---- Enrolled Student Details ----");
        sem1.displayEnrolledStudentDetails();


        Specialization spe = new Specialization();
        spe.addSpecialization("SE",2.75);
        spe.addSpecialization("DS",3.5);

    }
}

/*.......................Specialization.java...........................*/
package main;

import java.util.HashMap;


public class Specialization implements StudentSpecialization{

    public static HashMap<String, Double> specializationMap = new HashMap<>();

    public void addSpecialization(String specialization,double GPA) {
        specializationMap.put(specialization,GPA);
    }


}

