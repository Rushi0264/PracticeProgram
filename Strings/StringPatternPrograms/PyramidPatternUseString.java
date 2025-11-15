package Strings.StringPatternPrograms;

public class PyramidPatternUseString {
    public static void main(String[] args) {
        String str = "Hello";
        for (int i=0;i<=str.length();i++){
            System.out.println(str.substring(0,i));
        }
        for (int i=str.length()-1; i>=0; i--){
            System.out.println(str.substring(0,i));
        }
    }
}
