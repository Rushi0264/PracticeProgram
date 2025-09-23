package AccessModifiers;

public class A {
    A(String b){
        System.out.println("Hello "+b);
    }
    A(int a){
        this("Rushi");
        System.out.println("With parameter : "+a);
    }
    public static void main(String[] args) {
        A b = new A(3);
    }
}