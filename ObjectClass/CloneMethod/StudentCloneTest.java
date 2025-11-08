package ObjectClass.CloneMethod;

import ObjectClass.EqualsMethod.Student;

class StudentDetail implements Cloneable{
    int rollNo;
    String name,std;
    StudentDetail(int rollNo, String name, String std){
        this.rollNo=rollNo;
        this.name=name;
        this.std=std;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString(){
        return "Roll no : "+rollNo+", Name : "+name+", Standard : "+std;
    }
}

public class StudentCloneTest {
    static {
        System.out.println("Student Information..!");
    }
    public static void main(String[] args)
    throws CloneNotSupportedException{
        StudentDetail obj1 = new StudentDetail(11,"Vedanti","3rd_year");
        System.out.println(obj1);

        StudentDetail obj2 = (StudentDetail) obj1.clone();
        System.out.println(obj2);
    }
}
