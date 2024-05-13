
package bank;

public abstract class BankAccount {
    
    private double depositAmount;
    private double withdrawAmount;

    public BankAccount() {
    }

    public BankAccount(double depositAmount, double withdrawAmount) {
        this.depositAmount = depositAmount;
        this.withdrawAmount = withdrawAmount;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }
    
    
    public abstract void getDeposit();
    public abstract void getWithdraw();
    public abstract double calculateInterest();
    
}
