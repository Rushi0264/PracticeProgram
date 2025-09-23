package Polymorphism.OverridingRunTime;

//Rules for overriding
//1. Parent class method and child class method name are same with same datatype parameter.
//2. Method return type also have a same type.
//3. Method does not override in the same class, its override only in the child class.
//4. Override not possible without inheritance.

class A{
    void m1(){
        System.out.println("Method 1 without override");
    }
}
class B extends A {
    @Override
    void m1(){
        System.out.println("Method after override");
    }
}

public class Test1 {

    public static void main(String[] args) {
        A a = new B();
        a.m1();
    }
}
