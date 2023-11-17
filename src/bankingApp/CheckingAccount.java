package bankingApp;

public class CheckingAccount extends Account {

	//Transaction fee is constant
	private static double FEE = 2.5;
	
	//Default constructor
	public CheckingAccount() { super();}
	
	/**
	 * Parameterized constructor to initialize ChekingAccount
	 * with a customer Account Number and a Customer Transaction
	 * Fee
	 * 
	 */
	public CheckingAccount(int accountNumber, double fee) {
		super(accountNumber);
		FEE = fee;
	}
	/**
	 * Method to deposit funds in the Account as long as the amount parameter is > 0
	 * 
	 * Apply Transaction fee for CheckingAccount
	 * 
	 * @param amount value to be deposited
	 */
	@Override
	public void deposit(double amount) {
		//First check amount
		if(amount > 0) {
			
			balance += amount;
			System.out.printf("Amount of %.2f deposited%n", amount);
			//Apply transaction fee
			balance -= FEE;
			System.out.printf("Fee %.2f applied%n", FEE);
			System.out.printf("Current Balance is: %.2f%n", balance);
			
		}else {
			System.out.println("Amount cannot be a Negative value.");
		}
		
	}

	/**
	 * Method to withdraw funds in the Account as long as 
	 * 
	 * 1. the amount is > 0 
	 * 
	 * 2.the amount is <= balance
	 * 
	 * @param amount value to be withdrawn
	 */
	@Override
	public void withdraw(double amount) {
		//same check 
		if(amount > 0) {
			//check if sufficient balance available
			if((amount + FEE) <= balance) {
				
			balance -= amount;
			System.out.printf("Amount of %.2f withdrawn%n", balance);
			balance -=FEE;
			System.out.printf("Fee %.2f applied%n", FEE);
			System.out.printf("Current Balance is: %.2f%n", balance);
			}
		}else {
			System.out.println("Amount cannot be a Negative value.");
		}
		
	}

}
