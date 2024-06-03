
package evidencefulljava;

public class SavingsAccount extends BankAccount{

    public SavingsAccount() {
    }

    public SavingsAccount(double balance, double interestRate) {
        super(balance, interestRate);
    }


    @Override
    public void deposit(double amount) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void withdraw(double amount) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double calculateInterest() {
        return (super.getBalance()*super.getInterestRate())/100;
    }

    
    
}
