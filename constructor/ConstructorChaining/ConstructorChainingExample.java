package constructor.ConstructorChaining;

class Employee{
    Employee(){
        System.out.println("Employee Details..!");
    }

    Employee(int id){
        this();
        System.out.println("Employee ID : "+id);
    }

    Employee(int id, String name){
        this(101);
        System.out.println("Employee ID : "+id+" Employee Name : "+name);
    }
}

public class ConstructorChainingExample {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Rushi");
    }
}
