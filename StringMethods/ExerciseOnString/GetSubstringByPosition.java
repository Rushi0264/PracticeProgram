package StringMethods.ExerciseOnString;

public class GetSubstringByPosition {
    public static void main(String[] args) {
        String str1 = "The quick brown fox jumps over the lazy dog";

        System.out.println("Old string : "+str1);
        String newStr = str1.substring(10,25);
        System.out.println("New String : "+newStr);
    }
}
