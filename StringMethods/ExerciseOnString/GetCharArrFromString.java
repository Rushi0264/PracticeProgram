package StringMethods.ExerciseOnString;

public class GetCharArrFromString {
    public static void main(String[] args) {
        String str= "This is a sample string.";

        char[] charArr = new char[]{' ',' ',' ',' ',' ',' ',' ',' '};
        str.getChars(4,10,charArr,2);

        System.out.println("The char arrays equals : "+charArr);
    }
}
