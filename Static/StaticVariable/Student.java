package Static.StaticVariable;

public class Student {
    String name;
    static String college;

    Student(String name){
        this.name=name;
    }

    void display(){
        System.out.println("Student name is : "+name+"\nCollege name : "+college);
    }

    public static void main(String[] args) {
        Student.college = "Deogiri College Sambhajinagar.";
        System.out.println("Before changing college name.");

        Student s1 = new Student("Rushi");
        Student s2 = new Student("Sumit");
        Student s3 = new Student("Ganesh");

        s1.display();
        s2.display();
        s3.display();

        System.out.println();
        Student.college = "MIT College Pune";
        System.out.println("After changing college name.");

        s1.display();
        s2.display();
        s3.display();

    }
}
