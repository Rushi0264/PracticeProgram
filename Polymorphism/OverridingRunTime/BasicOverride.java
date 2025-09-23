package Polymorphism.OverridingRunTime;

abstract class Animal{
    abstract void sound();
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Woof");
    }
}

class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Meiou");
    }
}

public class BasicOverride {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.sound();
        Animal c = new Cat();
        c.sound();
    }
}
