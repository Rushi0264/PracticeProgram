package Polymorphism.OverridingRunTime;

class Vehicle{
    void run(){
        System.out.println("Vehicle is running");
    }
}

class Car extends Vehicle{
    @Override
    void run(){
        super.run();
        System.out.println("Car is running smoothly");
    }
}

public class MainVehicle {
    public static void main(String[] args) {
        Vehicle c = new Car();
        c.run();
    }
}
