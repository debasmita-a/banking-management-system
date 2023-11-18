package bankingApp;

//Savings account child class of Account
//has an interest rate
//a method to apply interest on account balance -- profit earned by customer

public class SavingsAccount extends Account {

    // interest rate
    private double interestRate;
    // Transaction fee is constant
    private static double FEE = 2.5;

    //Default constructor
    public SavingsAccount() { super(); }

    /**
     * parameterized constructor of SavingsAccount which will initialize
     * the customer account number and interest rate
     * 
     */
    public SavingsAccount(int accountNumber, double interestRate){
        super(accountNumber);
        this.interestRate = interestRate;
    }

    //getter and setter methods of interestRate

    public double getInterestRate(){
        return this.interestRate;
    }

    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }

    public double calcInterest(){
        return balance * interestRate; 
    }

    public void applyInterest(){
        double interest = calcInterest();
        System.out.printf("Interest amount of %.2f added to balance%n", interest);
        deposit(interest);
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
        // First check amount
        if (amount > 0) {

            balance += amount;
            System.out.printf("Amount of %.2f deposited%n", amount);

        } else {
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
        // same check
        if (amount > 0) {
            // check if sufficient balance available
            if (amount <= balance) {

                balance -= amount;
                System.out.printf("Amount of %.2f withdrawn%n", balance);
            }
        } else {
            System.out.println("Amount cannot be a Negative value.");
        }

    }

}
