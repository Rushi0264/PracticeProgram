package constructor;

public class Student {
    String name;
    int rollNo;

    public Student(String s, int i){
        name=s;
        rollNo=i;
        System.out.println("Name of student is "+name+" and roll no is : "+rollNo);
    }

    public static void main(String[] args) {
        Students std1 = new Students("Rushikesh", 1);

        Students std2 = new Students("Vedanti", 2);

        Students std3 = new Students("Anushka", 3);
    }
}

