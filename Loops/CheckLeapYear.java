package Loops;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year to check Leap year or not : ");
        int year=sc.nextInt();

        if (( ((year % 4 == 0) || ((year % 100 != 0) && (year % 400 == 0))))){
            System.out.println("Is leap year.!");
        }
        else {
            System.out.println("Is not leap year.!");
        }
    }
}
