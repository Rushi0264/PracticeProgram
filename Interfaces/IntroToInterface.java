package Interfaces;

interface A{
    int a=10;
}

interface B{
    static void show(){
        System.out.println("Static method");
    }
}

public interface IntroToInterface extends B{

    public static void main(String[] args) {
        System.out.println(A.a);
        B.show();
    }
}
