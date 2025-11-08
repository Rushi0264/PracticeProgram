package StringMethods.ExerciseOnString;

public class CountOfWordsInString {
    public static void main(String[] args) {
        String str = "Java is a object oriented programming language";

        String[] words = str.trim().split("\\s+");

        System.out.println("Number of words in above string : "+words.length);
    }
}
