package constructor.ConstructorChaining;

class Parent{
    Parent(){
        System.out.println("Parent no args constructor");
    }
    Parent(int a){
        this();
        System.out.println("Parent args constructor");
    }
}
class Child extends Parent{
    Child(){
        this(1);
        System.out.println("Child no args constructor");
    }

    Child(int a){
        super(5);
        System.out.println("Child args constructor");
    }
}

public class ConstructorChainingDemo {
    public static void main(String[] args) {
        System.out.println("Creating child object no args constructor");
        Child c = new Child();

        System.out.println();

        System.out.println("Creating child object args constructor");
        Child c1 = new Child(5);
    }
}
