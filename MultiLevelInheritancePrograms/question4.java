package MultiLevelInheritancePrograms;

class shape{
    void draw(){
        System.out.println("Draw the shape..!");
    }
}

class polygon extends shape{
    void sides(){
        System.out.println("Polygon has multiple sides..!");
    }
}

class triangle extends polygon{
    void calculateArea(){
        System.out.println("Calculating area of triangle...!");
    }
}

public class question4 {
    public static void main(String[] args) {
        triangle obj = new triangle();
        obj.draw();
        obj.sides();
        obj.calculateArea();
    }
}
