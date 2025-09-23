package MultiLevelInheritancePrograms;

class Appliance{
    void turnOn(){
        System.out.println("Appliance is turned on...!");
    }
}

class computer extends Appliance{
    void compute(){
        System.out.println("Computer is computing...!");
    }
}

class laptop extends computer{
    void carry(){
        System.out.println("Laptop is portable..!");
    }
}

public class question3 {
    public static void main(String[] args) {
        laptop obj = new laptop();
        obj.turnOn();
        obj.compute();
        obj.carry();
    }
}
