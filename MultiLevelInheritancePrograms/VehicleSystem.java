package MultiLevelInheritancePrograms;

import java.util.Scanner;

class vehicle1{
    Scanner sc = new Scanner(System.in);
    void openDoor(){
        System.out.print("Enter '1' to open the door :");
        int a = sc.nextInt();
        if (a==1){
            System.out.println("Doors will open..");
        }
        else {
            System.out.println("Not expected input");
        }
    }

    void closeDoor(){
        System.out.print("Enter '0' to close the door :");
        int b = sc.nextInt();
        if (b==0) {
            System.out.println("Doors will close");
        }
        else {
            System.out.println("Not expected input");
        }
    }
}

class car1 extends vehicle1{
    void startEngine(){
        System.out.print("Enter 1 to start the engine : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a==1){
            System.out.println("Engine starts..");
        }
        else {
            System.out.println("Something went wrong");
        }
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        car1 c = new car1();
        c.openDoor();
        c.closeDoor();
        c.startEngine();
    }
}
