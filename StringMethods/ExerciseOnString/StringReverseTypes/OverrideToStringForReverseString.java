package StringMethods.ExerciseOnString.StringReverseTypes;

public class OverrideToStringForReverseString {

    String str;
    OverrideToStringForReverseString(String str){
        this.str=str;
    }

    public String toString(){
        String reverse="";
        for (int i=str.length()-1;i>=0;i--){
            reverse +=str.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {
        OverrideToStringForReverseString obj = new OverrideToStringForReverseString("Hello Java");
        System.out.println(obj);
    }
}
