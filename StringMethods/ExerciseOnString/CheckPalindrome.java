package StringMethods.ExerciseOnString;

public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "Madam";
        String rev = "";

        for (int i=str.length()-1; i>=0; i--){
            rev +=str.charAt(i);
        }
        if (str.equalsIgnoreCase(rev)){
            System.out.println("String "+str+" is palindrome..");
        }else {
            System.out.println("String "+str+" is not palindrome..");
        }
    }
}
