package AbstractionProgramming;

abstract class Animals{
    abstract void sound();

    void show1(){
        System.out.println("Show method");
    }
}

class dog extends Animals{

    @Override
    void sound() {
        super.show1();
        System.out.println("Woof");
    }
}

class cat extends Animals{
    @Override
     void sound() {
        super.show1();
        System.out.println("meiow");
    }
}

public class AnimalCall{
    public static void main(String[] args) {
        Animals a = new dog();
        a.sound();

        Animals b = new cat();
        b.sound();
    }
}