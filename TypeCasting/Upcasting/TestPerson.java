package TypeCasting.Upcasting;

class Person{
    void showDetail(){
        System.out.println("I ma person");
    }
}
class Student extends Person{
    void showDetail(){
        System.out.println("I am student");
    }
}

public class TestPerson {
    public static void main(String[] args) {
        Person p = new Student();
        p.showDetail();
    }
}
