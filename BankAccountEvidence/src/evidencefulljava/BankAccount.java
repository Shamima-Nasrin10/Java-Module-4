
package evidencefulljava;

public abstract class BankAccount {
    
    private double balance;
    private double interestRate;

    public BankAccount() {
    }

    public BankAccount(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    
    public abstract double calculateInterest();
}
