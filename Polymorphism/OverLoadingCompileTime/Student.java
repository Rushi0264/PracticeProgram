package Polymorphism.OverLoadingCompileTime;

public class Student {
    void name(String name){
        System.out.println("Student name : "+name);
    }
    void name(String name, int id){
        System.out.println("Student name : "+name+" id : "+id);
    }

    public static void main(String[] args) {
        Student std = new Student();
        std.name("Rushi");
        std.name("Vedanti", 18);
    }
}
