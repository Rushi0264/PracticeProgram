package constructor;

public class defaultValues {
    int age;
    boolean isItGoingToRain;
    short s;
    long l;
    char c;
    String obj;
    double dd;

    public static void main(String[] args) {
        defaultValues obj = new defaultValues();  //JVM provided Constructor

        System.out.println("Default value of int is " + obj.age);
        System.out.println("Default value of boolean is " + obj.isItGoingToRain);
        System.out.println("Default value of short is " + obj.s);
        System.out.println("Default value of long is " + obj.l);
        System.out.println("Default value of char is " + obj.c);
        System.out.println("Default value of String is " + obj.obj);
        System.out.println("Default value of double is " + obj.dd);
    }
}