
package bankaccountsystem;

public class CurrentAccount extends Account{
    
    CurrentAccount(double balance)
    {
        super(balance);
    }
    
    void withdraw(double withdraw)
    {
        
        balance = balance - withdraw;
        System.out.println("Withdrawn: "+withdraw);
        System.out.println("Current Balance: "+ this.balance);
    }
    
}
