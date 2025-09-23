package Loops;

import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for sum of even number : ");
        int num=sc.nextInt();

        int sum=0;
        for (int i=1; i<=num; i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("Sum of even numbers : "+sum);
    }
}
