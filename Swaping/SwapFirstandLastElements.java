package Swaping;

public class SwapFirstandLastElements {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};

        for (int i=0;i<5;i++){
            System.out.println("Elements before swaping : "+arr[i]);
        }

        int temp;
        temp = arr[0];
        arr[0] = arr[4];
        arr[4] = temp;

        System.out.println("=========================================================");

        for (int i=0;i<5;i++){
            System.out.println("Elements after swaping : "+arr[i]);
        }
    }
}
