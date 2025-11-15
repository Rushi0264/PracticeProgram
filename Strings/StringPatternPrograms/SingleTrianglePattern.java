package Strings.StringPatternPrograms;

public class SingleTrianglePattern {
    public static void main(String[] args) {
        String str = "JAVA";

        for (int i=1;i<=str.length();i++){
            System.out.println(str.substring(0,i));
        }
    }
}
