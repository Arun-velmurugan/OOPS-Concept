
package bankaccountsystem;

import java.util.Scanner;

public class BankAccountSystem {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE DEPOSIT AMT: ");
        double depositAmt = sc.nextInt();
        System.out.print("ENTER THE WITHDRAW AMT: ");
        double withdrawAmt = sc.nextInt();
        
        //SavingsAccount s1 = new SavingsAccount(1000);
        CurrentAccount c1 = new CurrentAccount(1000);
        
        c1.deposit(depositAmt);
        c1.withdraw(withdrawAmt);
        c1.display();
    }
}
