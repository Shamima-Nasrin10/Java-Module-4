package evidencefulljava;

public class CheckingAccount extends BankAccount {

    private double withdrawLimit;
    private double fee;

    public CheckingAccount() {
    }

    public CheckingAccount(double withdrawLimit, double fee) {
        this.withdrawLimit = withdrawLimit;
        this.fee = fee;
    }

    public CheckingAccount(double withdrawLimit, double fee, double balance, double interestRate) {
        super(balance, interestRate);
        this.withdrawLimit = withdrawLimit;
        this.fee = fee;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public void deposit(double amount) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void withdraw(double amount) {
        if (amount>withdrawLimit) {
            amount = amount + fee;
        } 
        if(amount>super.getBalance()){
            System.out.println("Insufficient Balance");
        }
        else {
            System.out.println("Withdraw Amount: "+amount);
        }
        super.setBalance(super.getBalance()-amount);
    }

    @Override
    public double calculateInterest() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
