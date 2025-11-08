package StringMethods.ExerciseOnString;

public class RemoveAllSpacesFromString {
    public static void main(String[] args) {
        String str = "java is a fun lang";
        String noSpace = str.replaceAll("\\s","");
        System.out.println("String without spaces : "+noSpace);
    }
}
