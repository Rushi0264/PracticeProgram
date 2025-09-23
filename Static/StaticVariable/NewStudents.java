package Static.StaticVariable;

public class NewStudents {
    int rollNo;
    String name;
    static int nextRoll=1;

    NewStudents(String name){
        this.name=name;
         this.rollNo=nextRoll;
         nextRoll++;
        System.out.println("Student name = "+name+", Roll num = "+rollNo);
    }

    public static void main(String[] args) {
        NewStudents obj = new NewStudents("Rushi");
        NewStudents obj1 = new NewStudents("Sumit");
    }
}
