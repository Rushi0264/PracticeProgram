package ObjectClass.GetClassMethodPack;

class Animal{

}

class Dog extends Animal{

}

public class TypeCheck {
    public static void main(String[] args) {
        Animal obj = new Dog();

        if (obj instanceof Animal){
            System.out.println("Obj is a animal..");
        }

        if (obj.getClass() == Animal.class){
            System.out.println("Exact Animal");
        }else {
            System.out.println("Not exact animal");
        }
    }
}
