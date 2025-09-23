package constructor;

import java.util.Scanner;

public class IntroToConstructor {
    Scanner sc = new Scanner(System.in);
    IntroToConstructor() {
        System.out.println("This is Constructor");
        return;
    }

    IntroToConstructor(int a){
        System.out.println("Constructor with 1 parameter");
    }

    void IntroToConstructor() {
        System.out.println("This is Method same name as clas name");
    }

    void test() {
        System.out.println("This is Method");
    }

    public static void main(String[] args) {
        IntroToConstructor con = new IntroToConstructor();
        IntroToConstructor obj = new IntroToConstructor(4);
        con.IntroToConstructor();
        con.test();
    }
}
