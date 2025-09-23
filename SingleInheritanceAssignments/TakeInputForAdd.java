package SingleInheritanceAssignments;

import java.util.Scanner;

class addition{
    int a,b,c;
    Scanner sc = new Scanner(System.in);
    void sum(){
        System.out.println("Enter value A and B : ");
        a= sc.nextInt();
        b= sc.nextInt();
        c=a+b;
        System.out.println("Result : "+c);
    }
}

public class TakeInputForAdd extends addition{
    public static void main(String[] args) {
        TakeInputForAdd obj = new TakeInputForAdd();
        obj.sum();
    }
}
