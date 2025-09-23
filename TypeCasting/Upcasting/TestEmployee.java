package TypeCasting.Upcasting;

class Employee{
    void work(){
        System.out.println("Employee working");
    }
}

class Manager extends Employee{
    @Override
    void work(){
        System.out.println("Manager are working");
    }
}

class Developer extends Employee{
    @Override
    void work(){
        System.out.println("Developer develops the website");
    }
}

public class TestEmployee {
    public static void main(String[] args) {
        Employee obj = new Manager();
        obj.work();
        Employee obj1 = new Developer();
        obj1.work();
    }
}
