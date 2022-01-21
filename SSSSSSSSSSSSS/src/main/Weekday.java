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
