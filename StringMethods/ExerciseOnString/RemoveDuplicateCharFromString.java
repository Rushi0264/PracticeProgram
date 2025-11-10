package StringMethods.ExerciseOnString;

public class RemoveDuplicateCharFromString {
    public static void main(String[] args) {
        String str = "Java Programming";
        //char[] strToChar = str.toCharArray();
        str=str.toLowerCase();
        String newStr = "";

        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if (newStr.indexOf(ch) == -1){
                newStr+=ch;
            }
        }
        System.out.println(newStr);
    }
}
