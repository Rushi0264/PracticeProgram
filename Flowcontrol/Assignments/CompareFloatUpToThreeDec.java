package Flowcontrol.Assignments;

import java.util.Scanner;

public class CompareFloatUpToThreeDec {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input two float numbers
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            // Multiply and truncate to compare up to 3 decimals
            int n1 = (int)(num1 * 1000);
            int n2 = (int)(num2 * 1000);

            if (n1 == n2) {
                System.out.println("The numbers are the same up to three decimal places.");
            } else {
                System.out.println("The numbers are different.");
            }

            scanner.close();
        }
}
