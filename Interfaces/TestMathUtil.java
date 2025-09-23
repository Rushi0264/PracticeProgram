package Interfaces;

interface MathUtil{
    static int square(int a){
        int sq = a*a;
        System.out.println("Square of "+a+" = "+sq);
        return sq;
    }
}

public class TestMathUtil {
    public static void main(String[] args) {
        MathUtil.square(5);
    }
}
