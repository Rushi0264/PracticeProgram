package StringMethods.ExerciseOnString;

public class LengthOfString {
    public static void main(String[] args) {
        String str = "Hello";
        int count=0;

        /*for (char c : str.toCharArray()){
            count++;
        }*/
        for (int i=0;i<str.length();i++){
            count++;
        }
        System.out.println("Length of string : "+count);
    }
}
