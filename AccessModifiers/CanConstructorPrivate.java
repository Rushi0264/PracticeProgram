package AccessModifiers;

public class CanConstructorPrivate {
    private CanConstructorPrivate(){
        System.out.println("Yes constructor can be private");
    }

    public static void main(String[] args) {
        CanConstructorPrivate cp = new CanConstructorPrivate();
    }
}
