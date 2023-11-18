package bankingApp;

import java.util.Scanner;

public class AccountDriver{

    //entry point of program
     public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

       //create an array of accounts
        Account account[] = new Account[10];
        
     }

     /**
      * Method to create a new keyboard
      *
      * @param keyboard
      * @return Account
      */
     public Account createAccount(Scanner keyboard){

        
     }
     /**Menu to display options and get user's selection
      * 
      * @param  keyboard
      * @return choice
      */
   
     public int menu(Scanner keyboard){
        System.out.println("Bank Account Menu");
        System.out.println("1. Create new Account");
        System.out.println("2. Deposit Funds");
        System.out.println("3. Withdraw Funds");
        System.out.println("4. View Balance");

        int choice;
        do{
            System.out.println("Enter choice: ");
            choice = keyboard.nextInt();
        }while(choice < 1 || choice >4);

        return choice;
     }
}
