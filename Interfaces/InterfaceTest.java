package Interfaces;

interface AA{
    void show();
}

class BB implements AA{
    @Override
    public void show(){
        System.out.println("Show method");
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        AA a = new BB();
        a.show();
    }
}
