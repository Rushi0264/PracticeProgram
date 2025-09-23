package constructor.ConstructorChaining;

public class sss {
    String name;
    int rollNo;

    public sss(String s, int i){
        name=s;
        rollNo=i;
        System.out.println("Name of student is "+name+" and roll no is : "+rollNo);
    }

    public static void main(String[] args) {
        sss std1 = new sss("Rushikesh", 1);

        sss std2 = new sss("Vedanti", 2);

        sss std3 = new sss("Anushka", 3);
    }
}
