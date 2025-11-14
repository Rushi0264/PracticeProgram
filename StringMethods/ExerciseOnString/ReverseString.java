package StringMethods.ExerciseOnString;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello Java";
        String str2 = "";

        for (int i=str.length()-1;i>=0;i--){
            str2+=str.charAt(i);
            //str2 = str2+str.charAt(i);
        }
        System.out.println("Reverse String : "+str2);
    }
}
