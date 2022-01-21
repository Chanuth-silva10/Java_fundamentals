package E2;

public class Patient extends Person implements Comparable<Patient>{
	
	
	int appid;
    int patid;
	public Patient(String name, int appid, int patid) {
		super(name);
		this.appid = appid;
		this.patid = patid;
	}
	
	//specify the comparable attribute
	public int CompareTo(Patient obp) {
		
		if(this.patid > obp.appid)
		{
			
			return 1;
		}
		else if(this.patid < obp.appid) 
		{
			return -1;
			
		}else 
		{
			return 0;
		}
	}

	@Override
	public int compareTo(Patient o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
}
