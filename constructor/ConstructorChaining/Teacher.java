package constructor.ConstructorChaining;

class Person{
    Person(){
        System.out.println("This is person.");
    }
}

public class Teacher extends Person{
    Teacher(){
        super();
        System.out.println("This is teacher");
    }

    public static void main(String[] args) {
        Teacher t = new Teacher();
    }
}
