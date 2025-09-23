package Interfaces;

interface Calculator{
    int add(int a, int b);

    default void greet(){
        System.out.println("Welcome to calculator..!");
    }
}

class SimpleCalculator implements Calculator{
    @Override
    public int add(int a, int b) {
        int c= a+b;
        System.out.println("Addition of "+a+" and "+b+" = "+c);
        return c;
    }
}

public class TestCalculator {
    public static void main(String[] args) {
        Calculator cl = new SimpleCalculator();
        cl.greet();
        cl.add(4,6);
    }
}
