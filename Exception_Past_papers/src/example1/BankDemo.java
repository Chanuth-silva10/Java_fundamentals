package example1;

public class BankDemo {
	
	public static void main(String[] args) throws InsufficientBalanceException{
		Account account = new Account(123);
		System.out.println("Depositing Rs.10,000");
		account.deposit(10000.00);
	
		try {
			System.out.println("\nWithdrawing Rs.6000");
			account.withdraw(6000);
			
			System.out.println("\nWithdrawing Rs.8000");
			account.withdraw(8000);
		} catch (InsufficientBalanceException e) {
			System.out.println("Sorry, Your account remain only Rs"+e.getAmount());
		    e.printStackTrace();
		}
		
	}

}
