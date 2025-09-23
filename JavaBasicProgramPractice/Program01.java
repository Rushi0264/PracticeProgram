package JavaBasicProgramPractice;

public class Program01 {
    int addition(int a, int b){
        int c=a+b;
        System.out.println("Addition of a and b : "+c);
        return  c;
    }

    void returnNothing(int a, char b){
        System.out.println("This method return nothing");
    }

    void testMethod(int a, long b,boolean c){
        System.out.println("This method return nothing and take 3 arguments");
    }

    void method1(){
        System.out.println("This method can't take arguments so return nothing");
    }

    int mul(int a, int b){
        int c=a*b;
        System.out.println("Multiplication of a and b : "+c);
        return c;
    }

    public static void main(String[] args) {
        Program01 obj = new Program01();
        obj.addition(20,32);
        obj.returnNothing(21,'A');
        obj.testMethod(21,1234567890,true);
        obj.method1();
        obj.mul(5,3);
    }
}
