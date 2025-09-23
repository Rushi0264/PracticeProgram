package Swaping;

public class SwapValueUsing3rdVariable1 {
    public static void main(String[] args) {
        int a=32;
        int b=43;

        System.out.println("Value of a before swaping : "+a);
        System.out.println("Value of b before swaping : "+b);
        System.out.println();
        System.out.println("=======================================================");
        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println();
        System.out.println("Value of a after swaping : "+a);
        System.out.println("Value of a after swaping : "+b);
    }
}
