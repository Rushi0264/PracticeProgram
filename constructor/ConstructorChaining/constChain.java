package constructor.ConstructorChaining;

class vehicle{
    vehicle(){
        System.out.println("This is vehicle constructor");
    }
}

class car extends vehicle{
    car(String a){
        System.out.println("This is car constructor");
    }
}

class bike extends vehicle{
    bike(String a){
        System.out.println("This is bike constructor");
    }

    public static void main(String[] args) {
        bike b = new bike("Black");
    }
}

public class constChain extends car{
    constChain(){
        super("Rushi");
        System.out.println("This are child constructor of class car");
    }

    public static void main(String[] args) {
        constChain obj = new constChain();
    }
}

