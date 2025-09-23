package TypeCasting.Upcasting;

class Vehicle{
    void start(){
        System.out.println("Vehicle start");
    }
}
class Car extends Vehicle{
    @Override
    void start(){
        System.out.println("car start");
    }
}

public class TestVehicle {
    static void runVehicle(Vehicle v){
        v.start();
    }
    public static void main(String[] args) {
        Vehicle v = new Car();
        runVehicle(v);
    }
}
