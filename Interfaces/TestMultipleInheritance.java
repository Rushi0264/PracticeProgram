package Interfaces;

interface AB{
    void showA();
}

interface BA{
    void show();
}

class Check implements AA,BA{
    @Override
    public void show(){
        System.out.println("Method from check");
    }
}

public class TestMultipleInheritance {
    public static void main(String[] args) {
        Check c = new Check();
        c.show();
    }
}
