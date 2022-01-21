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
