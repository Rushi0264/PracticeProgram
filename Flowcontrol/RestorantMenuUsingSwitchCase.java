package Flowcontrol;

import java.util.Scanner;

public class RestorantMenuUsingSwitchCase {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();

        switch (choice){
            case 1:
                System.out.println("Pizza");
                break;
            case 2:
                System.out.println("Burger");
                break;
            case 3:
                System.out.println("Panipuri");
                break;
            case 4:
                System.out.println("Vadapav");
                break;
            default:
                System.out.println("Not available");
        }
    }
}
