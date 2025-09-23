package Swaping;

public class SwapValueUsing3rdVariable2 {
    public static void main(String[] args) {
        String car= "BMW";
        String truck = "BharatBenz";

        System.out.println("Value before swaping : "+car);
        System.out.println("Value before swaping : "+truck);

        String temp;
        temp = car;
        car = truck;
        truck = temp;

        System.out.println("Values after swaping : "+car);
        System.out.println("Values after swaping : "+truck);
    }
}
