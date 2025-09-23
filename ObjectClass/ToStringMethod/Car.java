package ObjectClass.ToStringMethod;

public class Car {
    private String brand;
    private double price;

    Car(String brand, double price){
        this.brand=brand;
        this.price=price;
    }

    public String toString(){
        return "Brand : "+brand+" Price : "+price;
    }

    public static void main(String[] args) {
        Car c = new Car("Tesla",2500000);
        Car c1 = new Car("Tesla",2500000);

        System.out.println(c);
        System.out.println(c1);
    }

}
