
package bank;

public class CheckingAccount extends BankAccount{
    
    private int charge;
    private double withdrawWithCharge;

    public CheckingAccount() {
    }

    public CheckingAccount(int charge) {
        this.charge = charge;
    }

    public CheckingAccount(int charge, double deposit, double withdraw) {
        super(deposit, withdraw);
        this.charge = charge;
    }

    public int getCharge() {
        return charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }
    

    
    
    @Override
    public void getDeposit() {
    
    }

    @Override
    public void getWithdraw() {
        if(super.getWithdrawAmount()>100){
           withdrawWithCharge= super.getWithdrawAmount()+charge;
           
        }
        else{
            withdrawWithCharge=super.getWithdrawAmount();
        }
        System.out.println(withdrawWithCharge);
    }

    @Override
    public double calculateInterest() {
       return 0.0;
    }
    
}
