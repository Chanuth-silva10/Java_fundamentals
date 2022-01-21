package E2;

public class FixedDepositAccount extends Account {
	private double interestRate,interest;
	
	public FixedDepositAccount(String accountNo, String name, double balance) {
		super(accountNo, name, balance);
		
	}

	
	
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public double getInterestRate() {
		return this.interestRate;
	}
		
	 public double calculateInterest() {
		
		 interest = balance * interestRate/100;
		 return interest;
		 
	 }
	
	
}
