package Swaping;

public class SwapValueUsing3rdVariable6 {
    public static void main(String[] args) {
        String Ghansawangi = "Rajesh Tope";
        String Ambad = "Narayan Kuche";

        System.out.println("Before swaping Ghansawangi : "+Ghansawangi);
        System.out.println("Before swaping Ambad : "+Ambad);

        String swap;
        swap = Ghansawangi;
        Ghansawangi = Ambad;
        Ambad = swap;

        System.out.println("After Swaping Ghansawangi : "+Ghansawangi);
        System.out.println("After swaping Ambad : "+Ambad);
    }
}
