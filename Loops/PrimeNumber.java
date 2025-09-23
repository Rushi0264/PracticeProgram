package Loops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int num;

        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        for(int i=2;i<num;i++){
            if(num%i==0){
                System.out.println("Is not a prime number");
            }
        }
    }
}
