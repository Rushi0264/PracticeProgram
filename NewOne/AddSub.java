package NewOne;

import java.util.Scanner;

public class AddSub extends inputFromUser{
    public int num;
    public AddSub() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 for addition.");
        System.out.println("Enter number 2 for subtraction.");
        System.out.println("Enter number 3 for multiplication.");
        System.out.println("Enter number 4 for division.");
        System.out.println("Enter number 5 for exit.");
        System.out.print("Choose one number : ");
        num = sc.nextInt();

        System.out.print("Enter two number for perform operation :");
        x = sc.nextInt();
        y = sc.nextInt();

        if (num == 1){
            int add = x+y;
            System.out.println("Addition of x and y : "+add);
        }

        if (num == 2){
            int sub=x-y;
            if (x>y){
                System.out.println("Subtraction of x and y : "+sub);
            } else if (x<y) {
                System.out.println("Subtraction of x and y : "+sub);
            }
        }

        if (num == 3){
            int mul=x*y;
            System.out.println("Multiplication of x and y : "+mul);
        }

        if (num == 4) {
            int div=x/y;
            System.out.println("Division of x and y : "+div);
        }

        if (num == 5){
            System.out.println("You Are Exit Now..!");
        }
    }
}
