package Cloning.ShalloCloning;

class Student implements Cloneable{
    int rollNo;
    Address1 address;

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

class Address1{
    int addressId;

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

public class TestStudent {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student obj1 = new Student();
        obj1.rollNo=1;

        Address1 address1 = new Address1();
        address1.addressId=101;

        obj1.address=address1;

        Student obj2 = (Student) obj1.clone();
        obj2.rollNo=20;
        obj2.address.addressId=120;

        System.out.println("Object 1 Roll no : "+obj1.rollNo);
        System.out.println("Object 2 Roll no : "+obj2.rollNo);

        System.out.println("----------------------------------------");

        System.out.println("Address id of object 1 : "+obj1.address.addressId);
        System.out.println("Address is of object 2 : "+obj2.address.addressId);
    }
}
