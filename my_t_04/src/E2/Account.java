package E2;

public abstract class Account {
    String accountNo,name;
    double balance;
   
   public Account(String accountNo, String name, double balance) {
	   this.accountNo = accountNo;  
	   this.name = name;
	   this.balance = balance;
   }
   public  void Deposit(double amount) {
	   this.balance = this.balance + amount;
	   
   }
   public abstract double calculateInterest();
   public void display() {
	   System.out.println("Account No :"+accountNo);
	   System.err.println("name"+name);
	   System.out.println("Balance is :"+balance);
   }
}

