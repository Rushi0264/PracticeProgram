package MultiLevelInheritancePrograms;

class employe{
    void getId(){
        System.out.println("Id of employees");
    }
    void getSalary(){
        System.out.println("Salary of employees");
    }
}

class doctors extends employe{
    void diagnosePatient(){
        System.out.println("Only for diagnose patient");
    }
}

class nurse extends employe{
    void assistDoctor(){
        System.out.println("Nurse is assistant of doctor");
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        doctors dr = new doctors();
        dr.diagnosePatient();
        dr.getId();
        dr.getSalary();

        System.out.println("============================");
        nurse nr = new nurse();
        nr.assistDoctor();
        nr.getId();
        nr.getSalary();
    }
}
