package Strings.StringPatternPrograms;

public class RepeaterFullString {
    public static void main(String[] args) {
        String str = "Java";
        for (int i=1; i<=4; i++){
            for (int j=1; j <= i; j++) {
                System.out.print(str+" ");
            }
            System.out.println();
        }
    }
}
