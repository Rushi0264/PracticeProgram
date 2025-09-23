package P1;

public class same {
    protected void show(){
        System.out.println("This show method using protected");
    }

    public static void main(String[] args) {
        same s = new same();
        s.show();
    }
}

class B {
    void sh(){
        System.out.println("Hello rushi");
    }

    public static void main(String[] args) {
        B b = new B();
        b.sh();
    }
}