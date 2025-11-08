package ObjectClass.HashCodeMethod;

public class Car {
    private String brand;
    private int price;

    Car(String brand, int price){
        this.brand=brand;
        this.price=price;
    }

    public int hashCode(){
        return price;
    }

    public static void main(String[] args) {
        Car c1= new Car("Tesla",2500000);
        System.out.println(c1.hashCode());
        Car c2 = new Car("Tesla",2500000);
        System.out.println(c2);
    }
}
