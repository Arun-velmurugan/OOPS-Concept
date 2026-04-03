
package bankaccountsystem;

//import java.util.Scanner;


public class Account {
    double balance;
    
    Account(double balance)
    {
        this.balance = balance;
    }
    
    void deposit(double depoAmt)
    {
        balance = balance + depoAmt;
        System.out.println("Deposited: "+ depoAmt);
    }
    
    void withdraw(double withdraw)
    {
        balance = balance - withdraw;
        System.out.println("Withdrawn: "+ withdraw);
       
    }
        void display()
        {
            System.out.println("Balance: "+ balance);
        }
        
        
}
