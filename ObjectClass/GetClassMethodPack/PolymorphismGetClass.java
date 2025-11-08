package ObjectClass.GetClassMethodPack;

class Parent{

}
class Child extends Parent{

}

public class PolymorphismGetClass {
    public static void main(String[] args) {
        Parent obj = new Child();
        System.out.println(obj.getClass());
    }
}
