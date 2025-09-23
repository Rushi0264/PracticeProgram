package Flowcontrol;

import java.util.Scanner;

public class OnlineShopingDiscountUsingIfElse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int totalAmount = sc.nextInt();

        if (totalAmount >= 1000){
            System.out.println("Discount up to 20% ");
        } else if (totalAmount >=500) {
            System.out.println("Discount up to 10%");
        }
        else {
            System.out.println("No discount..!");
        }
    }
}
