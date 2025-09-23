public class StringSwap {
    public static void main(String[] args) {
        String a = "Java";
        String b = "Programing";
        System.out.println("Before swaping A : "+a);
        System.out.println("Before swaping B : "+b);

        String temp  = a;
        a = b;
        b = temp;

        System.out.println("After swaping A : "+a);
        System.out.println("After swaping B : "+b);
    }
}