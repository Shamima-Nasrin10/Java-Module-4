
package abstractclassbank13;

import bank.BankAccount;
import bank.CheckingAccount;
import bank.SavingsAccount;

public class AbstractClassBank13 {

    public static void main(String[] args) {
        BankAccount savingsaccount= new SavingsAccount(100, 1, 0, 0);
        BankAccount checkingaccount= new CheckingAccount(0, 0, 0);
        
        System.out.println(savingsaccount.calculateInterest());
    }
    
}
