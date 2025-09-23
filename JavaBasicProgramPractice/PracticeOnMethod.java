package JavaBasicProgramPractice;

public class PracticeOnMethod {
    //Assignment
    //create method
    //Syntax 1
    //no_return methodName(){
    //}

    void message(){
        System.out.println("Hey this is a message method");
    }
    void prnt(){
        System.out.println("This is a prnt method");
    }
    void messageRepet(){
        System.out.println("This is a messageRepet method");
    }
    void showing(){
        System.out.println("This is a showing method");
    }
    void showout(){
        System.out.println("this is a showout method");
    }
    void tea(){
        //System.out.println("");
        System.out.println("\nMake a tea step by step:");
        System.out.println("Step 1: Take a kettle");
        System.out.println("Step 2: Fill the water in the kettle");
        System.out.println("Step 3: Kettle put on the gas and turn on the gas");
        System.out.println("Step 4: Then add milk and boil it");
        System.out.println("Step 5: Then add sugar and tea powder and boil it for 2 minute");
        System.out.println("Step 6: Lets tea is ready for drink");
    }

    //syntax 2
    //no_return_type methodName(parameter list){
    //}

    void add(int a, int b){
        int sum =a+b;
        System.out.println("\nAddition of a and b:" +sum);
    }

    void sub(int y, int z){
        int minus=y-z;
        System.out.println("Subtraction of y and z:" +minus);
    }
     void mul(int p, int q){
        int multiply=p*q;
         System.out.println("Multiplication of p and q:" +multiply);
     }
     void div(int a, int b){
        int division=a/b;
         System.out.println("Division of a and b:" +division);
     }
     void mod(int a, int b) {
         int module = a % b;
         System.out.println("Module of a and b:" + module);
     }

    //Syntax 3
    //returntype methodname(){
    //rerturn
    //}

    int addition(int a,int b){
        int sum=a+b;
        System.out.println("Addition of a and b:"+sum);
        return sum;
    }

    int subtraction(int a,int b){
        int sub=a-b;
        System.out.println("Subtraction of a and b:"+sub);
        return sub;
    }

    public static void main(String[] args) {
        //syntax of object
        //classname reference = new classname();
        PracticeOnMethod access = new PracticeOnMethod();
        //referenceName.methodName();
        access.message();
        access.prnt();
        access.messageRepet();
        access.showing();
        access.showout();
        access.tea();

        access.add(10,29);
        access.sub(32,29);
        access.mul(3,6);
        access.div(10,2);
        access.mod(9,2);

        access.addition(2,5);
        access.subtraction(5,2);
    }

}
