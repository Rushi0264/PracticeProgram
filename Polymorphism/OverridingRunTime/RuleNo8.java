package Polymorphism.OverridingRunTime;

/*8) A subclass within the same package as the instance’s superclass can override
any superclass method that is not declared private or final or static.*/

class SuperClass{
    void method1(){
        System.out.println("This is default method from parent class");
    }
    public void method2(){
        System.out.println("This is public method");
    }
    protected void method3(){
        System.out.println("This is protected method");
    }
    private void method4(){
        System.out.println("This is private method");
    }
    final void method5(){
        System.out.println("This is final method ");
    }
    static void method6(){
        System.out.println("THis is static method");
    }
}

class SubClass extends SuperClass{
    @Override
    void method1(){
        System.out.println("This is default method from child class");
    }

    @Override
    public void method2(){
        System.out.println("This is public method from child class");
    }

    @Override
    protected void method3(){
        System.out.println("This is protected method from child class");
    }

/*    private void method4(){
        System.out.println("");
    }

    final void method5(){
        System.out.println("");
    }

    static void method(){
        System.out.println("Can not override the private method of parent class");
    }*/
}

public class RuleNo8 extends SuperClass{
    public static void main(String[] args) {
        SubClass s = new SubClass();
        s.method1();
        s.method2();
        s.method3();
    }
}


