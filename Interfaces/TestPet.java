package Interfaces;

interface Animal{
    void eat();
}

interface Pet extends Animal{
    void play();
}

class Dog implements Pet{
    @Override
    public void eat() {
        System.out.println("Dog eating");
    }

    @Override
    public void play() {
        System.out.println("Dog playing");
    }
}

public class TestPet {
    public static void main(String[] args) {
        Pet b = new Dog();
        b.eat();
        b.play();
    }
}
