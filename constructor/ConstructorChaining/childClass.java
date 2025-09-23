package constructor.ConstructorChaining;

class parentClass{
    parentClass(){
        System.out.println("Parent class constructor no argument.");
    }
    parentClass(int a){
        System.out.println("Parent class constructor 1 argument.");
    }
    parentClass(String a, int b){
        System.out.println("Parent class constructor 2 argument.");
    }
    parentClass(char a, String b, int c){
        System.out.println("Parent class constructor 3 argument.");
    }
}

public class childClass extends parentClass{
    childClass(){
        super();
        System.out.println("child class constructor no argument");
    }
    childClass(int a){
        super(5);
        System.out.println("child class constructor 1 argument");
    }
    childClass(int a, String b){
        super("Rushi", 5);
        System.out.println("Child class constructor 2 arguments");
    }
    childClass(String a, int b, char c){
        super('V',"Vedanti",11);
        System.out.println("Child class constructor 3 arguments");
    }

    public static void main(String[] args) {
        childClass ch = new childClass();
        childClass ch1 = new childClass(2);
        childClass ch2 = new childClass(11,"Rushi");
        childClass ch3 = new childClass("Rushi",4,'c');
    }
}
