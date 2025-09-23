package SingleInheritanceAssignments;

class car{
    void maruti(){
        String a="Dzire", b="Swift";
        System.out.println(a+" and "+b);
    }
}

public class Inheritance2 extends car {
    public static void main(String[] args) {
/*        car carObj1 = new car();
        carObj1.maruti();*/

/*
        Inheritance1 obj = new Inheritance1();
        obj.addition();
*/

        Inheritance2 obj2 = new Inheritance2();
        obj2.maruti();
    }
}
