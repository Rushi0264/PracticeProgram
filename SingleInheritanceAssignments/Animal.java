package SingleInheritanceAssignments;

public class Animal {
    int a;
    Animal(){
        System.out.println("Constructor of parent class");
    }

    void drink(int b){
        System.out.println("drink water");
    }

    void eat(){
        this.drink(20);
        this.a=10;
        System.out.println("Animal eat"+a);
    }

}

class mammal extends Animal{
    void walk(){
        super.eat();
        System.out.println("Mammal walks");
    }
}

class dog extends mammal{
    void bark(){
        System.out.println("Dog bark");
    }

    public static void main(String[] args) {
        dog d = new dog();
        d.eat();
        d.walk();
        d.bark();
    }
}
