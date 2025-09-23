package ObjectClass.HashCodeMethod;

public class Employee {
    int id;
    String name;

    Employee(int id, String name){
        this.id=id;
        this.name=name;
    }

    public int hashCode(){
        return id;
    }
    public String toString(){
        return name;
    }

    public static void main(String[] args) {
        Employee emp = new Employee(101,"Rushi");
        System.out.println("Employee 1 hashcode : "+emp.hashCode()+" Name : "+emp.toString());

        Employee emp2 = new Employee(102,"Omkar");
        System.out.println("Employee 2 hashcode : "+emp2.hashCode()+" Name : "+emp.toString());
    }
}
