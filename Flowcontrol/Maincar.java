package Flowcontrol;

class car{
    void show(){
        System.out.println("This is show method");
    }

    public static void main(String[] args) {
        car  c = new car();
        c.show();
    }
}

public class Maincar {
    public static void main(String[] args) {
        car Car = new car();
        Car.show();
    }
}
