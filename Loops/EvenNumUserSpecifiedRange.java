package Loops;

import java.util.Scanner;

public class EvenNumUserSpecifiedRange {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Get range from the user
            System.out.print("Enter the starting number: ");
            int start = sc.nextInt();

            System.out.print("Enter the ending number: ");
            int end = sc.nextInt();

            System.out.println("Even numbers between " + start + " and " + end + ":");

            // Loop through the range
            for (int i = start; i <= end; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
}
