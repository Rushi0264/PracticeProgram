package ObjectClass.GetClassMethodPack;

class Employee{
    void show(){
        System.out.println("Hello Java");
    }
}

public class GetClassMethod {
    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println(e.getClass());
    }
}
