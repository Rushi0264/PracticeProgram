package StringMethods.ExerciseOnString.StringReverseTypes;

public class ReverseString2 {
    public static void main(String[] args) {
        String str = "Program";
        char[] arr = str.toCharArray();
        String rev = "";
        for (int i=arr.length-1; i>=0; i--){
            rev += arr[i];
        }
        System.out.println("Reverse String : "+rev);
    }
}
