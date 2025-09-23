package Polymorphism.OverLoadingCompileTime;

public class Employee {
    void empId(int id){
        System.out.println("Employee id : "+id);
    }
    void empId(int id, String name){
        System.out.println("Employee id : "+id+" Employee name : "+name);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.empId(101);
        emp.empId(102,"Rushikesh");
    }
}
