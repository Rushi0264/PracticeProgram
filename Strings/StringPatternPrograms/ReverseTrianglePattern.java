package Strings.StringPatternPrograms;

public class ReverseTrianglePattern {
    public static void main(String[] args) {
        String str = "JAVA";

        for (int i=str.length();i>0;i--){
            System.out.println(str.substring(0,i));
        }
    }
}
