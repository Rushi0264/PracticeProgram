package SingleInheritanceAssignments;

class employ{
    void work(){
        System.out.println("Employee is working..!");
    }
}

class manager extends employ{
    void manageTeam(){
        System.out.println("Managing the team..!");
    }
}

public class empManager {
    public static void main(String[] args) {
        manager obj = new manager();
        obj.work();
        obj.manageTeam();
    }
}
