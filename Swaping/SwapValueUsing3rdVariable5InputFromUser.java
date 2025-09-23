package Swaping;

import java.util.Scanner;

public class SwapValueUsing3rdVariable5InputFromUser {
    public static void main(String[] args) {
        int ageRushi;
        int ageOmkar;
        String userName1, userName2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age of user 1 for swap with user 2 age : ");
        ageRushi = sc.nextInt();
        userName1 = sc.nextLine();
        System.out.println("Enter age of user 2 for swap with user 1 age : ");
        ageOmkar = sc.nextInt();
        userName2 = sc.nextLine();

        int swapAge;
        swapAge = ageRushi;
        ageRushi = ageOmkar;
        ageOmkar = swapAge;

        System.out.println("Age of "+userName1+" after swap : "+ageRushi);
        System.out.println("Age of "+userName2+" after swap : "+ageOmkar);
    }
}
