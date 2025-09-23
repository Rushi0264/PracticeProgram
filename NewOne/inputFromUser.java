package NewOne;

import java.util.Scanner;

public class inputFromUser {
    int x,y;
    protected void takeInput(){
        System.out.print("Enter the two numbers : ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
    }
}
