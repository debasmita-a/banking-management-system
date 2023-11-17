package bankingApp;

//base class
//Abstract
public abstract class Account {

	// Account number
	private int accountNumber;

	// Balance
	protected double balance;

	// Default constructor
	public Account() {
	}

	// parameterized constructor
	public Account(int accountNumber) {
		this.accountNumber = accountNumber;
		balance = 0;
	}

	// Getter methods
	public double getBalance() {
		return this.balance;
	}

	public int getAccountNumber() {
		return this.accountNumber;
	}

	// Abstract methods:
	/**
	 * Method to deposit funds in the Account as long as the amount parameter is > 0
	 * 
	 * Apply Transaction fee for CheckingAccount
	 * 
	 * @param amount value to be deposited
	 */
	public abstract void deposit(double amount);

	/**
	 * Method to withdraw funds in the Account as long as 
	 * 
	 * 1. the amount is > 0 
	 * 
	 * 2.the amount is <= balance
	 * 
	 * @param amount value to be withdrawn
	 */
	public abstract void withdraw(double amount);

}
