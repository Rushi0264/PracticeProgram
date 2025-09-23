package Array;

public class SortAnArrayAscendingOrder {
    public static void main(String[] args) {
        int[] arr = {3,4,2,5,1,6,9,8,7,10};
        int temp =0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[j] < arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i]);
        }
    }
}
