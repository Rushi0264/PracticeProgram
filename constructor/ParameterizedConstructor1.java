package constructor;

class Students {
    Students(String name, int id){
        System.out.println("Student name "+name+" student id : "+id);
    }
}

public class ParameterizedConstructor1 {
    public static void main(String[] args) {
        Students s1 = new Students("Rushikesh", 101);
        Students s2 = new Students("Gaurav", 102);
        Students s3 = new Students("Anurag", 103);
        Students s4 = new Students("Omkar", 104);
        Students s5 = new Students("Dipak", 105);
    }
}
