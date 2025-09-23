package constructor.ConstructorChaining;

class parent{
    parent(){
        System.out.println("Parent constructor");
    }
}

class child extends parent{
    child(){
        super();//first line of child class constructor is a no-argument constructor of parent class, by default provide by JVM
        System.out.println("Child constructor");
    }
}

public class parentchild extends child{
    public static void main(String[] args) {
        parentchild pc = new parentchild();
    }
}

