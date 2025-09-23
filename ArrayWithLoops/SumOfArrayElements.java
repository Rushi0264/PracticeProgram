package ArrayWithLoops;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int array[] = {2,5,6,8,2};
        int sum=0;
        for (int i=0; i< array.length; i++) {
            sum = sum+array[i];
        }
        System.out.println(sum);
    }
}
