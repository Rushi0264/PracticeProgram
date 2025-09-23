package constructor;

class car{
    car(){
        System.out.println("Car is created");
    }
}

public class DefaultConstructorExample1 {
    public static void main(String[] args) {
        car c = new car();
        car c1 = new car();
        car c2 = new car();
    }
}
