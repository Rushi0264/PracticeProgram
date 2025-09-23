package Swaping;

public class SwapValueUsing3rdVariable4 {
    public static void main(String[] args) {
        String rushiAddress = "Wadigodri";
        String sumitAddress = "Ambad";

        System.out.println("Address of rushi before swaping : "+rushiAddress);
        System.out.println("Address of sumit before swaping : "+sumitAddress);

        String newAddress;
        newAddress = rushiAddress;
        rushiAddress = sumitAddress;
        sumitAddress = newAddress;

        System.out.println("Address of rushi after swaping : "+rushiAddress);
        System.out.println("Address of sumit after swaping : "+sumitAddress);
    }
}
