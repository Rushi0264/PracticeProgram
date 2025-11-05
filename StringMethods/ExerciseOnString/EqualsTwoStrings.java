package StringMethods.ExerciseOnString;
//Write a Java program to check whether two String objects contain the same data.
public class EqualsTwoStrings {
    public static void main(String[] args) {
        String str1 = "Hello world";
        String str2 = "Hello world";
        String str3 = "Hello Java";

        boolean checkStr1 = str1.equals(str2);
        boolean checkStr2 = str2.equals(str3);

        System.out.println(str1+" equals "+str2+" : "+checkStr1);
        System.out.println(str1+" equals "+str3+" : "+checkStr2);
    }
}
