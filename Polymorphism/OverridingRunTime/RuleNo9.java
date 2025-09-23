package Polymorphism.OverridingRunTime;
import Polymorphism.OverLoadingCompileTime.MainMethod;

//9) A subclass in a different package can only override the non-final methods declared public or protected.


public class RuleNo9 extends MainMethod {
   @Override
    protected void show(){
       System.out.println("Show method after override");
   }

    public static void main(String[] args) {
        RuleNo9 R = new RuleNo9();
        R.show();
    }
}
