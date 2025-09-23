package constructor;

public class PrivateConstructor {
    private PrivateConstructor(){
        System.out.println("This is private constructor");
    }

    public static void main(String[] args) {
        PrivateConstructor p = new PrivateConstructor();
    }
}
