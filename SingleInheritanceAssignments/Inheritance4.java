package SingleInheritanceAssignments;

class animal{
    String name="Bob";
    void dog(){
        System.out.println("Woof");
    }
}

public class Inheritance4 extends animal {
    public static void main(String[] args) {
        Inheritance4 obj  = new Inheritance4();
        obj.dog();
        animal obj1 = new animal();
        System.out.println(obj1.name);
    }
}
