package Flowcontrol.Assignments;

import java.util.Scanner;

public class QuadraticEquationSolve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input coefficients
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Check if it's a quadratic equation
        if (a == 0) {
            System.out.println("This is not a quadratic equation (a cannot be 0).");
        } else {
            double discriminant = b * b - 4 * a * c;

            // Case 1: Two real and distinct roots
            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("Roots are real and different.");
                System.out.println("Root 1 = " + root1);
                System.out.println("Root 2 = " + root2);
            }
            // Case 2: One real root
            else if (discriminant == 0) {
                double root = -b / (2 * a);
                System.out.println("Roots are real and equal.");
                System.out.println("Root = " + root);
            }
            // Case 3: Complex roots
            else {
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
                System.out.println("Roots are complex and imaginary.");
                System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
                System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
            }
        }
        scanner.close();
    }
}
