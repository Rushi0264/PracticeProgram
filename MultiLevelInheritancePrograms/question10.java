package MultiLevelInheritancePrograms;

class livingThing{
    void breathe(){
        System.out.println("Leaving things is breathing..!");
    }
}

class animal extends livingThing{
    void eat(){
        System.out.println("Animal is eating..!");
    }
}

class dog extends animal{
    void bark(){
        System.out.println("Dog is barking..!");
    }
}

public class question10 {
    public static void main(String[] args) {
        dog obj = new dog();
        obj.breathe();
        obj.eat();
        obj.bark();
    }
}
