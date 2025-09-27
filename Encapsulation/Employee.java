package Encapsulation;

public class Employee {
    private int empId;
    private String empName;
    private double salary;

    static {
        System.out.println("Employee Detail..!");
    }

    {
        System.out.println("----------------------------------------------------------------");
    }

    public void setEmpId(int empId){
        this.empId=empId;
    }
    public int getEmpId(){
        return empId;
    }

    public void setEmpName(String empName){
        this.empName=empName;
    }
    public String getEmpName(){
        return empName;
    }

    public void setSalary(double salary){
        if (salary > 0) {
            this.salary = salary;
        }else {
            System.out.println("Salary not found..!");
        }
    }
    public double getSalary(){
        return salary;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setEmpId(101);
        emp1.setEmpName("Avinash");
        emp1.setSalary(40000);
        System.out.println("Employee id : "+emp1.getEmpId());
        System.out.println("Employee name : "+emp1.getEmpName());
        System.out.println("Employee salary : "+emp1.getSalary());

        Employee emp2 = new Employee();
        emp2.setEmpId(102);
        emp2.setEmpName("Rushikesh");
        emp2.setSalary(45000);
        System.out.println("Employee id : "+emp2.getEmpId());
        System.out.println("Employee name : "+emp2.getEmpName());
        System.out.println("Employee salary : "+emp2.getSalary());
    }
}
