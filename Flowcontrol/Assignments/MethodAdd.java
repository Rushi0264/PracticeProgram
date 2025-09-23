package Flowcontrol.Assignments;

import java.util.Scanner;

public class MethodAdd {
    public static void main(String[] args) {
    MethodAdd obj = new MethodAdd();

    obj.add(1,2);
    }

    void add(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }
}
