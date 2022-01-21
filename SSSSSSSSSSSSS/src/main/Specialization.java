package main;

import java.util.HashMap;


public class Specialization implements StudentSpecialization{

    public static HashMap<String, Double> specializationMap = new HashMap<>();

    public void addSpecialization(String specialization,double GPA) {
        specializationMap.put(specialization,GPA);
    }


}
