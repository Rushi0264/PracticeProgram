package StringMethods.ExerciseOnString;

public class FindTheCountOfChar {
    public static void main(String[] args) {
        String str = "Hello Java";
        int count = 0;

        for (int i=0;i<str.length();i++){
            count++;
        }
        System.out.println("Count of character : "+count);
    }
}
