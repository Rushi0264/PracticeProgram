package HierarchicalInheritancePrograms;

class Person {
    int i=9;
    void speak() {
        System.out.println("Person speaks");
    }
}

class Student extends Person {
    void study() {
        System.out.println("Student studying");
    }
}

class Teacher extends Person {
    void teach() {
        System.out.println("Teacher teaching");
    }
}

public class question6 {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.speak();
        obj.study();

        Teacher obj1 = new Teacher();
        System.out.println(obj1.i);
        obj1.speak();
        obj1.teach();
    }
}
