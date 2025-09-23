package AbstractionProgramming;

import java.util.Scanner;

abstract class BankAccounts{
    static double a;
    static double d;

    void deposit(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount for deposit : ");
        a=sc.nextInt();
        System.out.println("Deposit amount is :"+a);
    }

    abstract void withdraw();
}

class SavingAccounts extends BankAccounts{
    @Override
    void withdraw(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter withdrawable amount of saving account : ");
        d=sc.nextInt();
        double avlBalance = a-d;
        System.out.println("After withdraw avl balance is : "+avlBalance);
    }
}

class CurrentAccounts extends BankAccounts{
    @Override
    void withdraw(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter withdrawable amount of current account : ");
        d=sc.nextInt();
        double avlBalance = a-d;
        System.out.println("After withdraw avl balance is : "+avlBalance);
    }
}

public class BankExample {

    public static void main(String[] args) {
        BankAccounts BA = new SavingAccounts();
        BA.deposit();
        BA.withdraw();


        System.out.println();

        BankAccounts BA1 = new CurrentAccounts();
        BA1.deposit();
        BA1.withdraw();
    }

}
