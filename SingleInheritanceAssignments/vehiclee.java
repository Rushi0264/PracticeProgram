package SingleInheritanceAssignments;
//Create a program where class Vehicle has a method move() and class Car extends Vehicle and adds a method horn().


public class vehiclee {
    void move(){
        System.out.println("This is move method.");
    }
}

class carr extends vehiclee{
    void horn(){
        System.out.println("This is horn method");
    }

    public static void main(String[] args) {
        carr c = new carr();
        c.move();
        c.horn();
    }
}
