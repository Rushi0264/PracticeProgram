package MultiLevelInheritancePrograms;

import java.util.Scanner;

class Accounts{
    int pin;
    int addAmount;

    Scanner sc = new Scanner(System.in);

    void secure(){
        System.out.print("Enter security pin : ");
        pin=sc.nextInt();
        if (pin == 12345){
            System.out.println("Welcome");
        }
        else {
            System.out.println("Incorrect pin..!");
        }
    }
    void deposit(){
        secure();
        System.out.print("Deposit amount :");
        addAmount=sc.nextInt();
        System.out.println("Balance after deposit amount : "+addAmount);
    }

}

//class SavingsAccount extends Accounts{
//    void calculateInterest(){
//
//    }
//}
//
//class currentAccounts extends SavingsAccount{
//    void extraBenefits(){
//
//    }
//}
public class BankAccountSystem {
    public static void main(String[] args) {
        Accounts a = new Accounts();
        a.deposit();
    }
}
