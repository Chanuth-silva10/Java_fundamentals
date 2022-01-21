package example1;

public class Account {
     private int accountNo;
     private double balance;
     
     public Account(int accountNo) {
 		this.accountNo = accountNo;    // 123
 	 }
     public void displayExistngBalance() {
    	 System.out.println("Existing amount :"+balance);
     }
     public void displayAccountNo() {
    	 System.out.println("Account Number :"+accountNo);
     }
     public void deposit(double amount) {//10,000
          balance +=amount;
     }
     public void withdraw(double amount) throws InsufficientBalanceException{//1 => 6000 , 2 => 8000
        if(balance < amount) {
        	throw new InsufficientBalanceException(amount);
        }else {
        	balance -=amount;
        }
    }
	 
}
