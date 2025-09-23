package Loops;

import java.util.Scanner;

public class PrintingEvenNumbers {

/*    void CheckNum(){
        int num=0;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        if(num%2==0){
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is odd ");
        }
    }

    public static void main(String[] args) {
        PrintingEvenNumbers obj=new PrintingEvenNumbers();
        obj.CheckNum();
    }*/

    public static void main(String[] args) {
/*        int num=0;
        Scanner sc = new Scanner(System.in);
        num=sc.nextInt();*/
        for (int i = 1; i <= 10; i++) {
            // Check if the number is even using the modulo operator
            if (i % 2 == 0) {
                System.out.println(i + " is Even");
            } else {
                System.out.println(i + " is Odd");
            }

        }
    }

}
