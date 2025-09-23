package HierarchicalInheritancePrograms;

class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Meowing...");
    }
}

public class question1 {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.eat();
        obj.bark();

        Cat obj1 = new Cat();
        obj1.eat();
        obj1.meow();

    }
}
