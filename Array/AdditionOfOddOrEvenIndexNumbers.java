package Array;
import Flowcontrol.Assignments.OddEven;

public class AdditionOfOddOrEvenIndexNumbers {
    public static void main(String[] args){
        int[] arr = {8,8,2,2,4,5,6,7,7,9};

        int EvenAdd = 0;
        int OddAdd = 0;

        for (int i=0; i< arr.length; i++){
            if (arr[i]%2==0){
                EvenAdd = EvenAdd + arr[i];
            }
            else {
                OddAdd = OddAdd+ arr[i];
            }
        }
        System.out.println("Addition of Even num : "+EvenAdd);
        System.out.println("Addition of odd num : "+ OddAdd);
    }
}
