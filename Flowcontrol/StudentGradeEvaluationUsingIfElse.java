package Flowcontrol;

import java.util.Scanner;

public class StudentGradeEvaluationUsingIfElse {
    public static void main(String[] args) {
        int mark;
        Scanner sc = new Scanner(System.in);
        mark = sc.nextInt();

        if(mark >= 90){
            System.out.println("Grade : A+");
        } else if (mark >= 75) {
            System.out.println("Grade : A");
        } else if (mark >= 60) {
            System.out.println("Grade : B");
        } else if (mark >= 35) {
            System.out.println("Grade : C");
        }
        else {
            System.out.println("Failed..!");
        }
    }
}
