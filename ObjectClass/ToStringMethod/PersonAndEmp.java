package ObjectClass.ToStringMethod;

class Person{
    private String name;
    private int age;

    public String toString(){
        return "Name : "+name+" Age : "+age;
    }
}

class Employee extends Person{
    private double salary;

    public String toString(){
        return " "+salary;
    }
}

public class PersonAndEmp {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        System.out.println(emp1);
    }
}
