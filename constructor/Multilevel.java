package constructor;

class Animal{
    Animal(){
        System.out.println("Animals have four legs.");
    }
}

class dog extends Animal{
    dog(){
        System.out.println("Dog is barking");
    }

    dog(String name){
        System.out.println("Dog name is dolly");
    }
}

class cat extends dog{
    cat(){
        System.out.println("cat says meiou");
    }
}

public class Multilevel extends cat{
    Multilevel(){
        System.out.println("All animals show in this class");
    }

    public static void main(String[] args) {
        Multilevel obj = new Multilevel();

         dog  obj2 = new dog("Dolly");
    }
}
