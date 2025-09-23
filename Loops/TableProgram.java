package Loops;

import java.util.Scanner;

public class TableProgram {

    void table(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print table : ");
        int num = sc.nextInt();
        if(num>0) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + "*" + i + "=" + num * i);
            }
        }
        else {
            System.out.println("Input is invalid.!");
        }
    }
    public static void main(String[] args) {
        TableProgram obj = new TableProgram();
        obj.table();
    }
}
