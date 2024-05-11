
package bank;

public class SavingsAccount extends BankAccount{
    
    private double balance;
    private double interestRate=10;
    private double time;

    public SavingsAccount() {
    }

    public SavingsAccount(double balance, double time) {
        this.balance = balance;
        this.time = time;
    }

    public SavingsAccount(double balance, double time, double deposit, double withdraw) {
        super(deposit, withdraw);
        this.balance = balance;
        this.time = time;
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

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
    

    @Override
    public double calculateInterest() {
        return (balance*interestRate*time)/100;
    }

    @Override
    public void getDeposit() {
    }

    @Override
    public void getWithdraw() {
        
    }
    
}
