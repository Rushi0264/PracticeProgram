package constructor;

class parentClass{
    parentClass(){
        System.out.println("This is parent class no-argument constructor");
    }

    parentClass(String name){
        System.out.println("This is parent class parametrized constructor");
    }
}

public class IntroToConstructorChaining extends parentClass{
    IntroToConstructorChaining(){
        System.out.println("This is child class constructor with no argument");
    }

    IntroToConstructorChaining(int age){
        System.out.println("This is child class constructor with parameter");
    }

    public static void main(String[] args) {
        IntroToConstructorChaining i = new IntroToConstructorChaining();
    }
}
