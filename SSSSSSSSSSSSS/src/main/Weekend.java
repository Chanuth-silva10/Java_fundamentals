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
