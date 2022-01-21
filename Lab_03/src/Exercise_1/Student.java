package Exercise_1;

public class Student {

	String name, dit, address;

	
	public String getDetails() {
		String s = "I am a Student.\nMy name is " + getName()+"\n I am from "+getAddress()+"\nMy dit no is " +"\n";
				return s;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDit() {
		return dit;
	}

	public void setDit(String dit) {
		this.dit = dit;
	} 

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	/*public Student(String newName, String newDit, String newAddress ) {
		
		name = newName;
		dit = newDit;
		address = newAddress;
	}*/
	
	
}
