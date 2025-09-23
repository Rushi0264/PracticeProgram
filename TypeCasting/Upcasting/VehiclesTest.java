package TypeCasting.Upcasting;

class Vehicles{
    void fuelType(){
        System.out.println("Vehicles have different types fuel");
    }
}

class Bike extends Vehicles{
    @Override
    void fuelType(){
        System.out.println("Bike have petrol");
    }
}


class CarTruck extends Vehicles {
    @Override
    public void fuelType() {
        System.out.println("Car and truck have diesel");
    }
}

public class VehiclesTest {
    public static void main(String[] args) {
        Vehicles obj1 = new Bike();
        obj1.fuelType();

        Vehicles obj2 = new CarTruck();
        obj2.fuelType();
    }
}
