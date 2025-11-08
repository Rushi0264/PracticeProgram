package ObjectClass.GetClassMethodPack;
class Parent1{

}
public class GetClassSimple {
    public static void main(String[] args) {
        Parent1 obj = new Parent1();
        System.out.println(obj.getClass().getName());
        System.out.println(obj.getClass().getSimpleName());
        System.out.println(obj.getClass().getPackageName());
    }
}