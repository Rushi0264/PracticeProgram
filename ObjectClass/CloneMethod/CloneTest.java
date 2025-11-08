package ObjectClass.CloneMethod;

class EmployeeDetail implements Cloneable{
    int empId;
    String empName;
    EmployeeDetail(int empId, String empName){
        this.empId=empId;
        this.empName=empName;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString(){
        return "Employee Detail -> EmpId : "+empId+", EmpName : "+empName;
    }

}
public class CloneTest{
    public static void main(String[] args)
    throws CloneNotSupportedException{
        EmployeeDetail obj1 = new EmployeeDetail(101,"Rushi");
        System.out.println(obj1);

        EmployeeDetail obj2 = (EmployeeDetail) obj1.clone();
        System.out.println(obj2);

        System.out.println(obj1==obj2);
    }
}