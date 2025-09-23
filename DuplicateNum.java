import java.util.Scanner;

public class DuplicateNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int original[] = new int[size];
        int max;
        int temp[] = new int[10];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            original[i] = sc.nextInt();
        }

        for (int i=0; i< original.length; i++){
            for (int j=i+1; j< original.length; j++){
                if (original[i] == original[j]){
                    temp[i]=original[j];
                    System.out.println(original[j]);
                }
            }
        }
        max= temp[0];
        for (int i =0 ; i<original.length; i++) {
            if (temp[i] > max) {
                max = temp[i];
            }
        }
        System.out.println("Max element from array : "+max);
    }
}
