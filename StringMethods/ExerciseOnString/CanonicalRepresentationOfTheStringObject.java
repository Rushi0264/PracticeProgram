package StringMethods.ExerciseOnString;

public class CanonicalRepresentationOfTheStringObject {
    public static void main(String[] args) {
        String str = "Hello";
        String str1 = new String("Hello");
        String str2 = str1.intern();

        System.out.println(str==str1);//false
        System.out.println(str==str2);//true
    }
}
