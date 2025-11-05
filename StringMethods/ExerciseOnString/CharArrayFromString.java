package StringMethods.ExerciseOnString;
//Write a Java program to create a character array containing a string.
public class CharArrayFromString {
    public static void main(String[] args) {
        String str1 = "Java Exercise";

        char[] arr = str1.toCharArray();
        for (int i=0;i<arr.length-1;i++) {
            System.out.println(arr[i]);
        }
    }
}
