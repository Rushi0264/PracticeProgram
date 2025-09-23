package constructor;

class parent{
    parent(){
        System.out.println("parent constructor");
    }
}

public class TypesOfConstructor extends parent{
    TypesOfConstructor(){
        super();
        System.out.println("child constructor");
    }
    /*public TypesOfConstructor(){
        System.out.println("This is No-arg");
    }

    public TypesOfConstructor(int age, String name){
        System.out.println("This is Parameterized");
    }

    public TypesOfConstructor(String t, String name, long l){
        System.out.println("This is 3 Params Constructor");
    }

    public static void main(String[] args) {
        TypesOfConstructor obj1 = new TypesOfConstructor();

        // TypesOfConstructors obj2 = new TypesOfConstructors(100, "Java");

//        TypesOfConstructors obj3 = new TypesOfConstructors("ABCD", "Java", 1000000);
    }*/

    public static void main(String[] args) {
        TypesOfConstructor t = new TypesOfConstructor();
    }
}