interface I{

}

class A implements I{

}

public class Instance{
    public static void main(String[] args) {
        A a = new A();
        if (a instanceof I){
            System.out.println("Yesss");
        }else {
            System.out.println("Nooo");
        }
    }
}
