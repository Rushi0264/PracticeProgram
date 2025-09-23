package SingleInheritanceAssignments;

import java.util.Scanner;

class Assi1 {
    void Assign() {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a and b : ");
        a = sc.nextInt();
        b = sc.nextInt();
        int c = a + b;
        System.out.println("Final result of this operation : "+c);
    }
}

public class Inheritance3 extends Assi1{
    public static void main(String[] args) {
        Inheritance3 use = new Inheritance3();
        use.Assign();
    }
}
