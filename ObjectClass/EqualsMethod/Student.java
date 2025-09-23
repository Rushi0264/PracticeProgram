package ObjectClass.EqualsMethod;

public class Student {
    int id;
    String name;
    Student(int id, String name){
        this.id=id;
        this.name=name;
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj)return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Student other = (Student) obj;
        return this.id==other.id && this.name.equals(other.name);
    }

/*    public String toString(){
        return id+" "+name;
    }*/

    public static void main(String[] args) {
        Student s1 = new Student(101,"Rushi");
        Student s2 = new Student(101,"Rushi");
        Student s3 = new Student(103,"Omkar");

        if (s1.equals(s2)){
            System.out.println("s1 and s2 are equal");
        }
        else {
            System.out.println("s1 and s2 are different");
        }

        if (s1.equals(s3)){
            System.out.println("s1 and s3 are equal");
        }
        else {
            System.out.println("s1 and s3 are different");
        }
    }
}
