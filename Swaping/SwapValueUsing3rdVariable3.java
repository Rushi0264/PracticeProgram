package Swaping;

public class SwapValueUsing3rdVariable3 {
    public static void main(String[] args) {
        int Sumit =20;
        int Rushi =21;

        System.out.println("Age of sumit before swaping : "+Sumit);
        System.out.println("Age of rushi before swaping : "+Rushi);

        int age;
        age = Sumit;
        Sumit = Rushi;
        Rushi = age;

        System.out.println("Age of Sumit after swaping : "+Sumit);
        System.out.println("Age of rushi after swaping : "+Rushi);
    }
}
