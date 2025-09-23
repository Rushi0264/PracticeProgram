package AbstractionProgramming;

abstract class vehicle{
    int numberOfTyres;

    abstract void start();

    void displayTyres(){
        System.out.println("Number of tyres : "+numberOfTyres);
    }
}

class car extends vehicle{
    void start(){
        System.out.println("Car start with key");
        numberOfTyres = 4;
    }
}

class bike extends vehicle{
    void start(){
        System.out.println("Bike start with kick");
        numberOfTyres = 2;
    }
}


public class mainVehicle {
    public static void main(String[] args) {
        car Car = new car();
        Car.start();
        Car.displayTyres();

        bike Bike = new bike();
        Bike.start();
        Bike.displayTyres();
    }
}
