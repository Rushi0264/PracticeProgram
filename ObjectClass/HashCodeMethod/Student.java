package ObjectClass.HashCodeMethod;

public class Student {
    private int id;
    private String name;

    Student(int id, String name){
        this.id=id;
        this.name=name;
    }

    public int hashCode(){
        return id;
    }

    public static void main(String[] args) {
        Student s1 = new Student(17,"Rushi");
        Student s2 = new Student(17,"Omkar");
        System.out.println(s1);
        System.out.println(s2);
    }
}
