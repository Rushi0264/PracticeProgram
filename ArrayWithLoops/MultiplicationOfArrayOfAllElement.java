package ArrayWithLoops;

public class MultiplicationOfArrayOfAllElement {
    public static void main(String[] args) {
        int arrayMul[] = {2,2,3,2};
        int num = 1;
        for (int i=0; i<arrayMul.length; i++){
            num = num * arrayMul[i];
        }
        System.out.println(num);
    }
}
