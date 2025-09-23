package MultiLevelInheritancePrograms;

class vehicle{
    void startEngine(){
        System.out.println("Engine Stared...!");
    }
}

class car extends vehicle{
    void drive(){
        System.out.println("Driving car...!");
    }
}

class electricCar extends car{
    void chargeBattery(){
        System.out.println("Battery charging..!");
    }
}

public class question1 {
    public static void main(String[] args) {
        electricCar obj = new electricCar();
        obj.startEngine();
        obj.drive();
        obj.chargeBattery();
    }
}
