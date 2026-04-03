
package bankaccountsystem;


public class SavingsAccount extends Account {
    
    SavingsAccount(double balance)
    {
        super(balance);
    }
    
    void withdraw(double withdraw)
    {
        
        if(withdraw>0 && withdraw<=balance)
        {
            balance = balance- withdraw;
            System.out.println("Withdrawn: "+withdraw);
        }
        else
        {
            System.out.println("INSUFFICIENT BALANCE");
        }
        System.out.println("Current Balance: "+balance);
    }
}
