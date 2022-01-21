package T4_E2;

public abstract class Account {
    protected String accountNo, name;
    protected double balance;
    
    public double Deposit(double amount) {
    	this.balance = this.balance + amount;
    	return this.balance;
    }
    public Account(String accountNo, String name, double balance) {
    	this.accountNo = accountNo;
    	this.name = name;
    	this.balance = balance;
    }
    public abstract double calculateInterest();
    
    public void display() {
    	System.out.println("Account No : "+this.accountNo);
    	System.out.println("Name : "+this.name);
    	System.out.println("Balance :"+this.balance);
    }
}
