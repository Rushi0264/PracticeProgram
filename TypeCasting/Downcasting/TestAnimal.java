package TypeCasting.Downcasting;

class Animal{
    void sound(){
        System.out.println("Animal sound");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Woof");
    }
}

public class TestAnimal {
    public static void main(String[] args) {
        Animal a = new Dog();

        Dog d = (Dog) a;
        a.sound();
    }
}
