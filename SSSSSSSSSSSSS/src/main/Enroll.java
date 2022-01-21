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



