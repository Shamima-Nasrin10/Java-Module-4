
package evidencefulljava;


public class EvidenceFullJava {

    public static void main(String[] args) {
       SavingsAccount savingsAccount=new SavingsAccount(1000, 10);
       
        System.out.println("Interest: "+savingsAccount.calculateInterest());
        
        CheckingAccount checkingAccount=new CheckingAccount(500, 10, 1000, 10);
        checkingAccount.withdraw(600);
        System.out.println("New balance after withdraw: "+checkingAccount.getBalance());
        
    }
    
}
