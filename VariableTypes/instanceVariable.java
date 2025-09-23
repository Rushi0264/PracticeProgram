package VariableTypes;

public class instanceVariable {
    int a;
    int b;
    int add = a+b;
    //instance variable declare outside the method or constructor but inside the class.
    //we don't need a initialize the variable
    //Instance : Default values based on type (e.g., int = 0, boolean = false, String = null).
    //instance variable access in main method using object. e.g(obj.a)

    public static void main(String[] args) {
        instanceVariable obj = new instanceVariable();
        System.out.println(obj.add);
    }
}
