package Array;

public class CopyArray2 {
    public static void main(String[] args) {
        int[] arr={2334,345354};
        int[] cpArr = new int[arr.length];

        for (int i=0; i<arr.length; i++){
            cpArr[i] = arr[i];
        }

        for (int i=0;i<cpArr.length;i++){
            System.out.println(cpArr[i]);
        }
    }
}
