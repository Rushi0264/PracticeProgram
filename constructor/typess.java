package constructor;

class A{
    A(){
        System.out.println("Constructor of class A");
    }

     A(int a){
        System.out.println("Constructor of class A with parameters");
    }
}

public class typess extends A {

    typess(){
        System.out.println("Constructor of class child class typess");
    }

    typess(String b){
        super(5);
        System.out.println("Constructor of class child class typess with parameter");
    }

    typess(int a, String  v, char y){
        super(7);
        System.out.println("Constructor of class child class typess with 3 parameter");
    }

    public static void main(String[] args) {
        typess t = new typess(4,"rushi",'d');
    }
}
