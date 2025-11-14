package Cloning.ShalloCloning;

class Address{
    String city;
    String state;

    Address(String city, String state){
        this.city=city;
        this.state=state;
    }
}

class Employee implements Cloneable{
    int empId;
    String empName;
    Address address;

    Employee(int empId, String empName, Address address){
        this.empId=empId;
        this.empName=empName;
        this.address=address;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

public class ShallowCloneDemo {
    public static void main(String[] args)
        throws CloneNotSupportedException{
        //Original object
            Address add1 = new Address("Pune","Maharashtra");
            Employee emp1 = new Employee(101,"Rushi",add1);

        //shallow clone object
        Employee emp2 = (Employee) emp1.clone();

        //Print before modify
        System.out.println("Before Modification..!");
        System.out.println(emp1.empName+" - "+emp1.address.city);
        System.out.println(emp2.empName+" - "+emp2.address.city);

        //Print after change the city
        emp2.address.city="Mumbai";
        System.out.println("After Modification..!");
        System.out.println(emp1.empName+" - "+emp1.address.city);
        System.out.println(emp2.empName+" - "+emp2.address.city);
    }
}
