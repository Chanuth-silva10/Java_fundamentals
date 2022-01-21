package X;

public class WeekdayStu {
   private String name;
   private String address;
   private String sex;
   private int bYear;
   private String spec;
   private String freeDay;
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
public int getbYear() {
	return bYear;
}
public void setbYear(int bYear) {
	this.bYear = bYear;
}
public String getSpec() {
	return spec;
}
public void setSpec(String spec) {
	this.spec = spec;
}
public String getFreeDay() {
	return freeDay;
}
public void setFreeDay(String freeDay) {
	this.freeDay = freeDay;
}
public WeekdayStu(String name, String address, String sex, int bYear, String spec, String freeDay) {
	super();
	this.name = name;
	this.address = address;
	this.sex = sex;
	this.bYear = bYear;
	this.spec = spec;
	this.freeDay = freeDay;
}
}
