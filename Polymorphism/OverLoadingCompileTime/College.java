package Polymorphism.OverLoadingCompileTime;

public class College {
    void dept(String deptName){
        System.out.println("Department name : "+deptName);
    }
    void dept(String deptName, int deptId){
        System.out.println("Department name : "+deptName+" department id : "+deptId);
    }

    public static void main(String[] args) {
        College clg = new College();
        clg.dept("Computer Science");
        clg.dept("Artificial Intelligence", 21);
    }

    public static void main(int a) {
        System.out.println("Hello java");
    }
}
class B extends College{
    public static void main(String[] args) {
        College cl = new College();
        cl.main(33);
    }
}