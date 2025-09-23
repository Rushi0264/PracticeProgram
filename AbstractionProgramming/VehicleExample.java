package AbstractionProgramming;

abstract class Vehicles{
    abstract void start();

    void stop(){
        System.out.println("Vehicle i s stop");
    }
}

class Truck extends Vehicles{
    @Override
    void start(){
        System.out.println("Truck is started.");
    }
}

class Cars extends Vehicles{
    @Override
    void start(){
        System.out.println("Car is started.");
    }
}

class Bike extends Vehicles{
    @Override
    void start(){
        System.out.println("Bike is started.");
    }
}

public class VehicleExample {
    public static void main(String[] args) {
        Vehicles t = new Truck();
        t.start();
        t.stop();

        Vehicles c = new Cars();
        c.start();
        c.stop();

        Vehicles b = new Bike();
        b.start();
        b.stop();
    }
}
