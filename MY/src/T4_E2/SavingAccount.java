package T4_E2;

public class SavingAccount extends  FixedDepositAccount{

	public SavingAccount(String accountNo, String name, double balance) {
		super(accountNo, name, balance);
		// TODO Auto-generated constructor stub
	}
	public double withdraw(double amount) {
		balance = balance - amount;
		return balance;
	
	}
    public double calculateInterest() {
    	Interest = balance * interestRate/100;
    	return Interest;
    }
}
