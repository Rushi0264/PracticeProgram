package HierarchicalInheritancePrograms;

class smartPhone{
    void phone(){
        System.out.println("This is smartphone...!");
    }
}

class Android extends smartPhone{
    void androidPhone(){
        System.out.println("This is android phone...!");
    }
}

class Apple extends smartPhone{
    void iPhone(){
        System.out.println("This is Iphone...!");
    }
}

public class question2 {
    public static void main(String[] args) {
        Android obj = new Android();
        obj.phone();
        obj.androidPhone();

        Apple obj2 = new Apple();
        obj2.phone();
        obj2.iPhone();
    }
}
