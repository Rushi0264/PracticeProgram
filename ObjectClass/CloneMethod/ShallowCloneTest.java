package ObjectClass.CloneMethod;

class Address{
    String city;
}

class Student implements Cloneable{
    int id;
    Address addr;

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

public class ShallowCloneTest {
    public static void main(String[] args)
    throws CloneNotSupportedException{
        Address a = new Address();
        a.city="Pune";

        Student s = new Student();
        s.id=11;
        s.addr=a;

        Student s2 = (Student) s.clone();

        System.out.println(s.addr.city);
        System.out.println(s2.addr.city);

        s2.addr.city="Mumbai";
        System.out.println(s2.addr.city);
        System.out.println(s==s2);
    }
}
