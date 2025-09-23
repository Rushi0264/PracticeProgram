package TypeCasting.Upcasting;

import java.util.HexFormat;

class Parent{
    void display(){
        System.out.println("I am parent class");
    }

}

class Child extends Parent {
    @Override
    void display(){
        System.out.println("I am child class");
    }
}

public class TestParent {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.display();
    }
}
