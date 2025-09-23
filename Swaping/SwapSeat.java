package Swaping;

public class SwapSeat {
    public static void main(String[] args) {
        String student1 = "Omkar";
        String student2 = "Rushi";

        System.out.println("Before Swapping Seats..!");
        System.out.println("Seat No 1 is : "+student1);
        System.out.println("Seat No 2 is : "+student2);


        String temp;
        temp = student1;
        student1 = student2;
        student2 = temp;

        System.out.println();
        System.out.println("After Swapping Seats..!");
        System.out.println("Seat No 1 is : "+student1);
        System.out.println("Seat No 2 is : "+student2);
    }
}
