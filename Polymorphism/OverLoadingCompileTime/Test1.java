package Polymorphism.OverLoadingCompileTime;

//Rules for Overloading
//In a same class
//Method name is the same
//Parameter list is different (by type or number)

class A{
    void m1(){
        System.out.println("Hello");
    }

    void m1(int a){
        System.out.println("Hello java "+a);
    }

    void m1(int a, String b){
        System.out.println(a+" Hello "+b);
    }

}

public class Test1 {
    public static void main(String[] args) {
        A a = new A();
        a.m1(2);
        a.m1(101,"Vedu");
    }
}
