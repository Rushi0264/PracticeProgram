package Flowcontrol.Assignments;

import java.util.Scanner;

public class Vidhansabha {
    public static void main(String[] args) {
        int vidhansabhaa;
        String Matadarsangh = "";

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter matdarsangh number : ");
        vidhansabhaa=obj.nextInt();

        //1.Jalna
        //2.Mantha-partur
        //3.Ambad-badnapur
        //4.Ghansawangi
        //5.Jafrabad-bhokardan

        switch (vidhansabhaa) {
            case 1:
                System.out.println("MLA Arjun Khotkar (Shivsena)");
                Matadarsangh += "Jalna";
                break;
            case 2:
                System.out.println("MLA Babanrao Lonikar (BJP)");
                Matadarsangh += "Mantha-Partur";
                break;
            case 3:
                System.out.println("MLA Narayan Kuche (BJP)");
                Matadarsangh += "Ambad-Badanapur";
                break;
            case 4:
                System.out.println("MLA Hikmat Udhan (Shivsena)");
                Matadarsangh += "Ghansawangi";
                break;
            case 5:
                System.out.println("MLA Santosh Danave (BJP)");
                Matadarsangh += "Jafrabad-Bhokardan";
                break;
            default:
                Matadarsangh += "Not found..!";
                break;
        }
        System.out.println("Running matadarsangh is " + Matadarsangh);
    }
}