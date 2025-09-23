package TypeCasting.Upcasting;

class Animal{
    void sound(){
        System.out.println("Animal have different sounds");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Woof");
    }
    void leg(){
        System.out.println("Dog has 4 legs");
    }
}

public class TestAnimal {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.sound();
//        obj.leg(); //not possible
    }
}
