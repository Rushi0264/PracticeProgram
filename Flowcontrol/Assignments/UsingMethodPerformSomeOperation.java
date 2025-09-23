package Flowcontrol.Assignments;

import java.util.Scanner;

public class UsingMethodPerformSomeOperation {
    void Rushi(){
        String name="Rushikesh", address="Wadigodri";
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the "+name+" age : "+sc);
        age=sc.nextInt();
        if (age>=18){
            System.out.println("Name of voter : "+name);
            System.out.println("Address of voter : "+address);
            System.out.println("Age of voter is greater or equal to 18 = " +age);
        }
        else {
            System.out.println("Voter age is smaller than 18 that is = "+age);
        }
    }

    void Sumit(){
        String name="Sumit", address="Ambad";
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the "+name+" age : "+sc);
        age=sc.nextInt();
        if (age>=18){
            System.out.println("Name of voter : "+name);
            System.out.println("Address of voter : "+address);
            System.out.println("Age of voter is greater or equal to 18 = " +age);
        }
        else {
            System.out.println("Voter age is smaller than 18 that is = "+age);
        }
    }

    void Om(){
        String name="Omkar", address="Jalna";
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the "+name+" age : "+sc);
        age=sc.nextInt();
        if (age>=18){
            System.out.println("Name of voter : "+name);
            System.out.println("Address of voter : "+address);
            System.out.println("Age of voter is greater or equal to 18 = " +age);
        }
        else {
            System.out.println("Voter age is smaller than 18 that is = "+age);
        }
    }

    public static void main(String[] args) {
        UsingMethodPerformSomeOperation obj= new UsingMethodPerformSomeOperation();
        obj.Rushi();
        obj.Sumit();
        obj.Om();

    }
}
