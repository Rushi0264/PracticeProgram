package StringMethods.ExerciseOnString;
//Write a Java program to check whether a given string ends with another string.

public class CheckEndOfStrings {
    public static void main(String[] args) {
        String str = "Python Exercise";
        String str2 = "Python Exercises";

        String endStr = "se";
        boolean end1 = str.endsWith(endStr);
        boolean end2 = str2.endsWith(endStr);

        System.out.println(end1);
        System.out.println(end2);
    }
}
