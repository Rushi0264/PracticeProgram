package HierarchicalInheritancePrograms;

class Employee {
    void showDetails() {
        System.out.println("Employee details");
    }
}

class Manager extends Employee {
    void manage() {
        System.out.println("Manager managing team");
    }
}

class Developer extends Employee {
    void develop() {
        System.out.println("Developer writing code");
    }
}

public class question5 {
    public static void main(String[] args) {
        Manager obj = new Manager();
        obj.showDetails();
        obj.manage();

        Developer obj1= new Developer();
        obj1.showDetails();
        obj1.develop();
    }
}
