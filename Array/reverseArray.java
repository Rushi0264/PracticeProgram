package Array;

import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        int []arr= new int[size];

        System.out.print("Enter "+size+" elements : ");
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Original array given from user : ");
        for (int i=0;i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        System.out.print("Reverse array : ");
        for (int i= arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        System.out.println("Duplicate element : ");
        for (int i=0; i<arr.length;i++){
            for (int j=i+1;j< arr.length; j++){
                if (arr[i] == arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}