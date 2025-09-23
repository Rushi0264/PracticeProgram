package SingleInheritanceAssignments;

class vehicle{
    void start(){
        System.out.println("Vehicle is start now..!");
    }
}

public class car11 extends vehicle {

    void drive() {
        System.out.println("Car is driving...");
    }

    public static void main(String[] args) {
        car11 obj = new car11();
        obj.start();
        obj.drive();
    }
}
