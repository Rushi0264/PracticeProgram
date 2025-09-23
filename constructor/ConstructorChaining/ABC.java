package constructor.ConstructorChaining;
class A{
    A(){
        System.out.println("A");
    }

    A(int a){
        this("Rushi");
        System.out.println("Parameter");
    }

    A(String b){
        this();
        System.out.println("String");
    }
}

public class ABC extends A{
    ABC(){
        super(2);
        System.out.println("ABC");
    }

    public static void main(String[] args) {
        ABC a = new ABC();
    }
}
