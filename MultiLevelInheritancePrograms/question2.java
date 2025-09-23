package MultiLevelInheritancePrograms;

class employee{
    void work(){
        System.out.println("Employee working..!");
    }
}

class manager extends employee{
    void manageTeam(){
        System.out.println("Managing team..!");
    }
}

class seniorManager extends manager{
    void makeDecisions(){
        System.out.println("Senior manager making decision...!");
    }
}

public class question2 {
    public static void main(String[] args) {
        seniorManager obj = new seniorManager();
        obj.work();
        obj.manageTeam();
        obj.makeDecisions();
    }
}
