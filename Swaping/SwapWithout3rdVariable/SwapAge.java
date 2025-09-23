package Swaping.SwapWithout3rdVariable;

public class SwapAge {
    public static void main(String[] args) {
        int ageRushi=21;
        int ageSumit=20;

        System.out.println("Age of Rushi before swaping : "+ageRushi);
        System.out.println("Age of Sumit before swaping : "+ageSumit);

        ageRushi = ageRushi + ageSumit;
        ageSumit = ageRushi - ageSumit;
        ageRushi = ageRushi - ageSumit;

        if (ageRushi == 21) {
            System.out.println("Age of Rushi after swaping : " + ageRushi);
            System.out.println("Age of Rushi after swaping : " + ageSumit);
        }
        else {
            System.out.println("Age of rushi not match with 21..!");
        }
    }
}
