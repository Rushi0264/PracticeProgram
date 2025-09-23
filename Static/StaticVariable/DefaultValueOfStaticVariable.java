package Static.StaticVariable;

public class DefaultValueOfStaticVariable {
    static int number;
    static String name;
    static boolean status;

    public static void main(String[] args) {
        System.out.println("Default value of static int: " + number);
        System.out.println("Default value of static boolean: " + status);
        System.out.println("Default value of static String: " + name);
    }
}
