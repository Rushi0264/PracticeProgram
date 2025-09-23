package Swaping.SwapWithout3rdVariable;

public class SwapValue1 {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        System.out.println("Before swaping : "+a);
        System.out.println("Before swaping : "+b);

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("After swaping : "+a);
        System.out.println("After swaping : "+b);
    }
}
