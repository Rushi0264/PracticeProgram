package Static.StaticVariable;

public class ObjectCounter {
    static int count = 0;
    ObjectCounter(){
        count++;
    }
    void show(){
        System.out.println("Object numbers : "+count);
    }

    public static void main(String[] args) {
        ObjectCounter obj = new ObjectCounter();
        obj.show();

        ObjectCounter obj1 = new ObjectCounter();
        obj1.show();

        ObjectCounter obj2 = new ObjectCounter();
        obj2.show();
    }
}
