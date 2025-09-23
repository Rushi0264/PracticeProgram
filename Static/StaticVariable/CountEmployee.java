package Static.StaticVariable;

public class CountEmployee {
    String empName;
    static int totalEmployees=100;

    CountEmployee(String name){
        this.empName=name;
        totalEmployees++;
    }
    void show(){
        System.out.println("Employee name : "+empName);
    }

    public static void main(String[] args) {
        CountEmployee obj = new CountEmployee("Sumit");
        obj.show();

        CountEmployee obj1 = new CountEmployee("jay");
        obj1.show();

        CountEmployee obj2 = new CountEmployee("Omkar");
        obj2.show();
        
        CountEmployee obj3 = new CountEmployee("Arjun");
        obj3.show();

        System.out.println(CountEmployee.totalEmployees);
    }

}
