package StringMethods.ExerciseOnString.StringReverseTypes;

public class OverrideToString {
    String str;
    OverrideToString(String str){
        this.str=str;
    }

    public String toString(){
        String rev = "";
        for (int i= str.length()-1; i>=0; i--){
            rev += str.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        /*for (int i=arr.length-1; i>=0; i--){
            rev += arr.toString();
        }*/
        OverrideToString obj = new OverrideToString("Hello world");

        System.out.println("Reverse String : "+obj);
    }
}
