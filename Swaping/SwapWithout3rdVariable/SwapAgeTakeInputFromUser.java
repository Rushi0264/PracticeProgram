package Swaping.SwapWithout3rdVariable;

import java.util.Scanner;

public class SwapAgeTakeInputFromUser {
    public static void main(String[] args) {
        int ageGanesh;
        int ageAvinash;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age of ganesh : ");
        ageGanesh = sc.nextInt();
        System.out.println("Enter age of Avinash : ");
        ageAvinash = sc.nextInt();

        int temp = ageGanesh;
        ageGanesh = ageAvinash;
        ageAvinash = temp;

        if ((ageGanesh >= 21) && (ageAvinash >= 21)){
            System.out.println("Ganesh you can marry..!"+ageGanesh);
            System.out.println("Avinash you can marry..!"+ageAvinash);
        }
        else {
            System.out.println("Both of you can't marry right now..!");
        }
    }
}
