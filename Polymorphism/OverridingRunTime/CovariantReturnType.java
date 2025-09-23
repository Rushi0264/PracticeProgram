package Polymorphism.OverridingRunTime;

class Parent{
    Object getObject(){
        return "Parent Object";
    }
}

class Child extends Parent{
    String getObject(){
        return "Child String";
    }
}

public class CovariantReturnType {
    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println(p.getObject());

        Parent c = new Child();
        System.out.println(c.getObject());
    }
}
