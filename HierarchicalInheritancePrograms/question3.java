package HierarchicalInheritancePrograms;

class vehicle{
    void start(){
        System.out.println("Vehicle started..!");
    }
}

class fourWheeler extends vehicle{
    void car(){
        System.out.println("Car has AC..!");
    }
}

class twoWheeler extends vehicle{
    void bike(){
        System.out.println("Bike has helmet storage..!");
    }
}

public class question3 {
    public static void main(String[] args) {
        fourWheeler obj = new fourWheeler();
        obj.start();
        obj.car();

        twoWheeler obj2 = new twoWheeler();
        obj2.start();
        obj2.bike();
    }
}
