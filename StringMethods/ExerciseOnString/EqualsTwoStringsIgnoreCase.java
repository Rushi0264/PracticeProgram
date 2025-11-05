package StringMethods.ExerciseOnString;

public class EqualsTwoStringsIgnoreCase {
    public static void main(String[] args) {
        String str1 = "I am Rushi";
        String str2 = "i am rushi";
        String str3 = "I AM RUSHI";

        boolean checkStr1 = str1.equalsIgnoreCase(str2);
        boolean checkStr2 = str2.equalsIgnoreCase(str3);
        boolean checkStr3 = str3.equalsIgnoreCase(str1);

        System.out.println(str1+" is equals "+str2+" : "+checkStr1);
        System.out.println(str2+" is equals "+str3+" : "+checkStr2);
        System.out.println(str3+" is equals "+str1+" : "+checkStr3);
    }
}
