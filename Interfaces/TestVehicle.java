package Interfaces;

interface Vehicle{
    void start();
}

class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("Car starts with button..");
    }
}

class Bike implements Vehicle{
    @Override
    public void start() {
        System.out.println("Bike starts with key..");
    }
}

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle c = new Car();
        c.start();

        Vehicle b = new Bike();
        b.start();
    }
}
