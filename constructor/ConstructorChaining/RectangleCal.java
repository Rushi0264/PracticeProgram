package constructor.ConstructorChaining;

class Rectangle{
    int width;
    int height;

    Rectangle(int width, int height){
        this.width=width;
        this.height=height;
    }

    void calculate(){
        int res=width*height;
        System.out.println("Area of rectangle : "+res);
    }
}

public class RectangleCal {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10,5);
        r.calculate();
    }
}
