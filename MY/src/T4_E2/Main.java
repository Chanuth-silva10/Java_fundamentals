package T4_E2;

public class Main {

	public static void main(String[] args) {
		FixedDepositAccount f1 = new FixedDepositAccount("SA0147854","Chanuth",150000);
		f1.setInterestRate(14.5);
		
		System.out.println("deposit balance :"+f1.Deposit(4500));
		System.out.println("Annual Interest :"+f1.calculateInterest());
        
		SavingAccount s1 = new SavingAccount("SD145278","Maduka",78000);
		
		s1.calculateInterest();
		System.out.println("After the Withdrawing balance:"+s1.withdraw(5200));
		System.out.println("Monthly Interest :"+s1.calculateInterest());
        
		
	}

}
