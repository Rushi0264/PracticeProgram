package StringMethods.ExerciseOnString;

public class TrimWhiteSpaces {
    public static void main(String[] args) {
        String str = "  Java Exercises   ";
        String trimStr = str.trim();

        System.out.println("Original string : "+str);
        System.out.println("Updated string : "+trimStr);
    }
}
