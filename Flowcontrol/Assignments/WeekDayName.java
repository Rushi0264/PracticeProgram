package Flowcontrol.Assignments;

import java.util.Scanner;

public class WeekDayName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of weekday : ");
        int dayNum = sc.nextInt();
        String today = "";

       /* if(dayNum==1){
            System.out.println("Monday");
        } else if (dayNum==2) {
            System.out.println("Tuesday");
        } else if (dayNum==3) {
            System.out.println("Monday");
        } else if (dayNum==4) {
            System.out.println("Monday");
        } else if (dayNum==5) {
            System.out.println("Monday");
        } else if (dayNum==6) {
            System.out.println("Monday");
        } else if (dayNum == 7){
            System.out.println("Monday");
        }else{
            System.out.println("Invalid");
        }*/

        switch (dayNum) {
            case 1:
                today = "Monday";
                break;
            case 2:
                today = "tuesday";
                break;
            case 3:
                today = "Wednesday";
                break;
            case 4:
                today = "thursday";
                break;
            case 5:
                today = "Friday";
                break;
            case 6:
                today = "Saturday";
                break;
            case 7:
                today = "Sunday";
                break;
            default:
                System.out.println("Invalid number..!");
                break;
        }
       if (dayNum <= 7) {
            System.out.println("Today is : " + today);
        }
        else {
            System.out.println();
        }
        }
    }