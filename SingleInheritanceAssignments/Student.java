package SingleInheritanceAssignments;

public class Student {
    String Name = "Rushi";
    int RollNo = 13;
    int Marks = 404;
    void stdInfo(){
        System.out.println("Information of student : ");
    }
}

class address extends Student{
    void remain(){
        System.out.println("Address of "+Name+" is Wadigodri");
    }
    public static void main(String[] args) {
        address obj = new address();
        obj.stdInfo();
        System.out.println("Name of Student "+obj.Name+" Roll No is "+obj.RollNo+" Obtained marks "+obj.Marks);
        obj.remain();
    }
}
