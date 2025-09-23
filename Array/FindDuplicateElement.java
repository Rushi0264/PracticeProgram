package Array;

public class FindDuplicateElement {
    public static void main(String[] args) {
        int[] arr =  {1,2,3,3,4,5,5,6};
        int[] dup=new int[arr.length];

        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length;j++){
                if (arr[i]==arr[j]){
                    dup[i]=arr[j];
                    System.out.println(dup[i]);
                }
            }
        }
    }
}
