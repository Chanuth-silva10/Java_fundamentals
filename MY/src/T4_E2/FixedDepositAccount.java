package T4_E2;

public class FixedDepositAccount extends Account{
    protected double interestRate, Interest;
	public FixedDepositAccount(String accountNo, String name, double balance) {
		super(accountNo, name, balance);
		
	}
	public void setInterestRate(double interestRate ) {
		this.interestRate = interestRate;
	} 
	public double getInterestRate() {
		return this.interestRate;
	}

	@Override
	public double calculateInterest() {
		this.Interest = balance * interestRate/100;
		return this.Interest;
	}
       
}
