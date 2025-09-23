package AbstractionProgramming;

abstract class shape{

    abstract void area();

    void show(String a){
        System.out.println("Shape of "+a);
    }
}

class circle extends shape{
    @Override
    void area(){
        System.out.println("Area of circle");
    }
}

class Rectangle extends shape{
    @Override
    void area() {
        System.out.println("Area of Rectangle");
    }
}

class Triangle extends shape{
    @Override
    void area(){
        System.out.println("Area of Triangle");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        shape cir = new circle();
        cir.show("Circle");
        cir.area();

        System.out.println();

        shape rec = new Rectangle();
        cir.show("Rectangle");
        rec.area();

        System.out.println();

        shape tri = new Triangle();
        cir.show("Triangle");
        tri.area();

    }
}
