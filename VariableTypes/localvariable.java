package VariableTypes;

public class localvariable {
    void local(){
        int a=2;
        int b=12;
        //local variable declare with in the method, constructor or block
        //in the local variable we must declare the value to variable
        //local variable access within the method or constructor only

        int add = a+b;
        System.out.println("Add "+add);
    }

    public static void main(String[] args) {
        localvariable obj = new localvariable();
        obj.local();
        //System.out.println(obj.add);
    }
}