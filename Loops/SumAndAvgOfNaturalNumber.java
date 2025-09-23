package Loops;

import java.util.Scanner;

public class SumAndAvgOfNaturalNumber {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number : ");
        int n=sc.nextInt();

        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            System.out.println(sum);
        }

        double average = (double) sum / n;
        System.out.println("Average = " + average);

    }
}
