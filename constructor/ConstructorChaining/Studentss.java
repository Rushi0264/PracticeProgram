package constructor.ConstructorChaining;

class student{
    String name;
    int age;
    student(String name){
        this(name,21);
        System.out.println("This constructor with one parameter");
    }

    student(String name, int age){
//        this.name=name;
//        this.age=age;
        System.out.println("This constructor with two parameter");
        System.out.println("Name is "+name+" Age is "+age);
    }
}

public class Studentss {
    public static void main(String[] args) {
        student st = new student("Rushi");

        student st1 = new student("Vedanti", 20);
    }
}
