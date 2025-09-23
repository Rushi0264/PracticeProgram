package Flowcontrol.Assignments;

import java.util.Scanner;

public class CheckPosNegNumber {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        if(num>0){
            System.out.println("Entered number is positive that is :"+num);
        } else if (num<0) {
            System.out.println("Entered number is negative that is :"+num);
        }
        else {
            System.out.println("Entered number is zero");
        }
    }
}
