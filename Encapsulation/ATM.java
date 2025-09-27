package Encapsulation;

import java.util.Scanner;

public class ATM {
    private double balance;
    private int pin=12345;

    public void checkBalance(int enteredPin){
        if (pin == enteredPin){
            System.out.println("Account balance : "+balance);
        }
    }

    public void deposit(int enteredPin, double amount){
        if (pin == enteredPin){
            if (amount > 0){
                balance += amount;
                System.out.println("Deposited amount : "+amount);
            }
            else {
                System.out.println("Invalid amount..!");
            }
        }
    }

    public void withdraw(int enteredPin, double amount){
        if (enteredPin == pin) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance or invalid amount!");
            }
        }
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your pin : ");
        int userPin = sc.nextInt();
        if (userPin == atm.pin) {
            atm.deposit(userPin, 40000);
            atm.withdraw(userPin, 12000);
            atm.checkBalance(userPin);
        }else {
            System.out.println("Invalid PIN..!");
        }
    }
}
