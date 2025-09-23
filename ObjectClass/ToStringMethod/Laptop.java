package ObjectClass.ToStringMethod;

public class Laptop {
    String model;
    int ram;

    Laptop(String mode, int ram){
        this.model=mode;
        this.ram=ram;
    }

    public String toString(){
        return model+" "+ram;
    }

    public static void main(String[] args) {
        Laptop l = new Laptop("HP Victus",512);
        System.out.println(l);
    }
}
