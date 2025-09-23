package Flowcontrol.Assignments;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check number is even or odd : ");
        a= sc.nextInt();

        if (a%2==0){
            System.out.println(a+" is a Even number.");
        }
        else {
            System.out.println(a+" is a Odd number.");
        }

    }
}
