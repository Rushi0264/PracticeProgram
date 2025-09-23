package MultiLevelInheritancePrograms;

class person1{
    void getName(){
        System.out.println("Getting name of person");
    }
    void getAddress(){
        System.out.println("Getting address of person");
    }
}

class student1 extends person1{
    void getGrades(){
        System.out.println("Getting grades of students");
    }
}

class teacher extends person1{
    void assignHomework(){
        System.out.println("Assigning homework");
    }
}

public class schoolSystem {
    public static void main(String[] args) {
        student1 st = new student1();
        st.getName();
        st.getAddress();
        st.getGrades();
        System.out.println("============================");

        teacher tc = new teacher();
        tc.assignHomework();
    }
}
