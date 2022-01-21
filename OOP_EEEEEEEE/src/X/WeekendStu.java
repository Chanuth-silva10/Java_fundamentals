package X;

public class WeekendStu {
   private String name;
   private String address;
   private String sex;
   private int bYear;
   private String spec;
   private String Jtitle;
public WeekendStu(String name, String address, String sex, int bYear, String spec, String jtitle) {
	super();
	this.name = name;
	this.address = address;
	this.sex = sex;
	this.bYear = bYear;
	this.spec = spec;
	Jtitle = jtitle;
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
public String getJtitle() {
	return Jtitle;
}
public void setJtitle(String jtitle) {
	Jtitle = jtitle;
}
   
}
