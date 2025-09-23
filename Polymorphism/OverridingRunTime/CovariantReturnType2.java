package Polymorphism.OverridingRunTime;

class Parents{
    Object getData(){
        return "Data from parent";
    }
}

class Childs extends  Parents{
    @Override
    String getData(){
        super.getData();
        return "Data from child";
    }
}

public class CovariantReturnType2 {
    public static void main(String[] args) {
        Parents p = new Parents();
        System.out.println(p.getData());

        Parents c = new Childs();
        System.out.println(c.getData());
    }
}
