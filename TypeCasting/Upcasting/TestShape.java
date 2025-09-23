package TypeCasting.Upcasting;

class Shape{
    void draw(){
        System.out.println("All shapes are different");
    }
}
class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Circle shape");
    }
}
class Square extends Shape{
    @Override
    void draw(){
        System.out.println("Square shape");
    }
}

public class TestShape {
    public static void main(String[] args) {
        Shape obj = new Circle();
        obj.draw();
        Shape obj1 = new Square();
        obj1.draw();
    }
}
