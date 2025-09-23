package Static.StaticVariable;

class Parent{
    static int a=10;
}

class Child extends Parent{
    static int a = 20;
}

public class Test {
    public static void main(String[] args) {
        System.out.println(Parent.a);
        System.out.println(Child.a);
    }
}
