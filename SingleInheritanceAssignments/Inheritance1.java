package SingleInheritanceAssignments;

class add{

    void addition(){
        int a=9;
        int b = 10;
        int res = a+b;
        System.out.println("Addition : "+res);
    }
}

public class Inheritance1 extends add{
    public static void main(String[] args) {
        add obj1 = new add();
        obj1.addition();

        Inheritance1 obj2 = new Inheritance1();
        obj2.addition();
    }
}
