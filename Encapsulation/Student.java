package Encapsulation;

public class Student {
    private String name;
    private int rollNo;
    private int marks;

    static {
        System.out.println("Student Information..!");
        System.out.println("----------------------------------------------------------------");
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setRollNo(int rollNo){
        if (rollNo > 0) {
            this.rollNo = rollNo;
        }else {
            System.out.println("Roll no not valid..!");
        }
    }

    public int getRollNo(){
        return rollNo;
    }

    public void setMarks(int marks){
        if (marks > 0 && marks <=100) {
            this.marks = marks;
        }else {
            System.out.println("Marks not found");
        }
    }

    public int getMarks(){
        return marks;
    }

    public static void main(String[] args) {
        Student std1 = new Student();
        std1.setName("Rushi");
        std1.setRollNo(1);
        std1.setMarks(98);
        System.out.println("Student name : "+std1.getName());
        System.out.println("Roll no : "+std1.getRollNo());
        System.out.println("Marks : "+std1.getMarks());
        System.out.println("----------------------------------------------------------------");

        Student std2 = new Student();
        std2.setName("Omkar");
        std2.setRollNo(2);
        std2.setMarks(100);
        System.out.println("Student name : "+std2.getName());
        System.out.println("Roll no : "+std2.getRollNo());
        System.out.println("Marks : "+std2.getMarks());
        System.out.println("----------------------------------------------------------------");
    }
}
