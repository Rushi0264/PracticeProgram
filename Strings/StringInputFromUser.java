package Strings;

import java.util.Scanner;

public class StringInputFromUser {
    public static void main(String[] args) {
        /*String abc = "Rushi";
        System.out.println(abc);*/

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("My name is : "+name);
    }
}

