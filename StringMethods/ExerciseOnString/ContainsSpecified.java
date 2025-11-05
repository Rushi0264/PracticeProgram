package StringMethods.ExerciseOnString;

//Write a Java program to test if a given string contains the specified sequence of char values.
public class ContainsSpecified {
    public static void main(String[] args) {
        String str = "PHP Exercises and Python Exercises";
        String str2 = "and";

        System.out.println("Original string : "+str);
        System.out.println("Specified sequence of char values: " + str2);

        System.out.println(str.contains(str2));
    }
}
