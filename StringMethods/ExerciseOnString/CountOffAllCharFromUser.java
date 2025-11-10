package StringMethods.ExerciseOnString;

import java.util.Scanner;

public class CountOffAllCharFromUser {
    public static void main(String[] args) {
        System.out.println("Enter String : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        //str = str.toLowerCase();
        str = str.replace(" ", "");

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            // print first occurrence
            if (str.indexOf(ch) == i) {
                System.out.println(ch + " = " + count);
            }

            //System.out.println(ch+" = "+count);

        }
    }
}