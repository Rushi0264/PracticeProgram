package AbstractionProgramming;

abstract class boy{
    abstract void boyTalk();

    void show(){
        System.out.println("It is non-abstract method");
    }
}

class rushi extends boy{
    @Override
    void boyTalk() {
        System.out.println("I am Talking..!");
    }

    @Override
    void show() {
        super.show();
        System.out.println("New non-abstract method ");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        rushi obj = new rushi();
        obj.boyTalk();
        obj.show();
    }
}
