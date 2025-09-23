package OperatorPrograms;

import java.util.Scanner;

public class AssiOnLargeThreeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println("Value of A is greater than B & C that is = "+a);
        } else if (b>a && b>c) {
            System.out.println("Value of B is greater than A & C that is = "+b);
        } else if (c>a && c>b) {
            System.out.println("Value of C is greater than A & B that is = "+c);
        }
        else {
            System.out.println("Input type is invalid..!");
        }
    }
}
