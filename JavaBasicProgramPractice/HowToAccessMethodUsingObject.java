package JavaBasicProgramPractice;

public class HowToAccessMethodUsingObject {
    int age = 100; //variable
    String name = "Java";//variable

    long salary = 100000;
    double salary2 =123.4567890;
    float amount = 12290.3f;
    byte distance = 20;
    short password = 4312;
    char Division = 'A';
    boolean Value = true;
    int num=21;
    char alphabet = 'A';
    long number = 7666;

    int addition(int a, int b){//methods
        int c = a+b;
        System.out.println("Addition : "+c);
        return c;
    }


    // Methods
    void test(){
        System.out.println("Test method of a class");
    }

    void show(){
        System.out.println("show method");
    }

    void method(){
        System.out.println("This is method ");
    }

    void dummy(){
        System.out.println("This is dummy method ");
    }

    void practice1(){
        System.out.println("This is practice1 method ");
    }

    void practice2(){
        System.out.println("This is practice2 method ");
    }

    void practice3(){
        System.out.println("This is practice3 method  ");
    }

    void mix(){
        System.out.println("This is mix method");
    }

    public static void main(String[] args) {
        HowToAccessMethodUsingObject obj = new HowToAccessMethodUsingObject();

        //syntax for accessing variables
        //referencesName.variableName;
        //int a = obj.age;
        System.out.println("Access Variable using object "+obj.age);
        System.out.println("Access name Variable using object "+obj.name);
        System.out.println("Access salary Variable using object "+obj.salary);
        System.out.println("Access salary2 Variable using object "+obj.salary2);
        System.out.println("Access amount Variable using object "+obj.amount);
        System.out.println("Access distance Variable using object "+obj.distance);
        System.out.println("Access password Variable using object "+obj.password);
        System.out.println("Access Division Variable using object "+obj.Division);
        System.out.println("Access Number Variable using object "+obj.num);
        System.out.println("Access alphabet Variable using object "+obj.alphabet);
        System.out.println("Access number Variable using object "+obj.number);
        System.out.println("Access boolean variable using object "+obj.Value);


        //syntax for accessing methods
        //referenceName.methodName();
        obj.addition(2,5);
        obj.test();
        obj.show();
        obj.method();
        obj.dummy();
        obj.practice1();
        obj.practice2();
        obj.practice3();
        obj.mix();
    }
}
