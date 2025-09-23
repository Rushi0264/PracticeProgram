package HierarchicalInheritancePrograms;

class shape{
    void draw(){
        System.out.println("Drawing shape..");
    }
}

class circle extends shape{
    void area(){
        System.out.println("Area of circle..");
    }
}

class reactangle extends shape{
    void area(){
        System.out.println("Area of reactangle..");
    }
}

public class question8 {
    public static void main(String[] args) {
        circle obj = new circle();
        obj.draw();
        obj.area();

        reactangle obj1 = new reactangle();
        obj1.draw();
        obj1.area();
    }
}
