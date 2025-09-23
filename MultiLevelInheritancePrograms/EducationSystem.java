package MultiLevelInheritancePrograms;

class personn{
    void getName(String name){
        System.out.println("Name of student is "+name);
    }
}

class studentN extends personn{
    void getRollNo(int rNo){
        System.out.println("Roll number is "+rNo);
    }
}

class stdDepartment extends studentN{
    void department(String deptName){
        System.out.println("Department name is "+deptName);
    }
}
public class EducationSystem {
    public static void main(String[] args) {
        stdDepartment sd = new stdDepartment();
        sd.getName("Rushikesh chepte");
        sd.getRollNo(13);
        sd.department("Computer Science");
    }
}
