package Interfaces;

interface Shape{
    void area();
}

class Circle implements Shape{
    @Override
    public void area() {
        double pi=3.14;
        int r = 2;
        double area = pi * (r*r);
        System.out.println("Area of circle is : "+area);
    }
}

class Rectangle implements Shape{
    @Override
    public void area() {
        int l=4, w=3;
        int area = l*w;
        System.out.println("Area of rectangle is : "+area);
    }
}

public class TestShape {
    public static void main(String[] args) {
        Shape Cir = new Circle();
        Cir.area();

        Shape Rect = new Rectangle();
        Rect.area();
    }
}
