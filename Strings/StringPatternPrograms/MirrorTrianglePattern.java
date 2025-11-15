package Strings.StringPatternPrograms;

public class MirrorTrianglePattern {
    public static void main(String[] args) {
        String str = "Java";

        for (int i=1; i<=str.length(); i++){
            for (int j=str.length(); j>i; j-- ) {
                System.out.print(" ");
            }

            System.out.println(str.substring(0,i));
        }
    }
}
