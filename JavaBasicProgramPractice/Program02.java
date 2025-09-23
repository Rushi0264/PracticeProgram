package JavaBasicProgramPractice;

public class Program02 {
    void rtrnNothing(int a, int b){
        System.out.println("Return nothing take 2 arguments");
    }

    void sub(int a, int b){
        int c=a-b;
        System.out.println("Subtraction of a and c: "+c);
    }

    void add(int a,  char c){
        System.out.println("Addition of 2 diff arguments int and char");
    }

    void multiply(int p, int q){
        int r=p*q;
        System.out.println("This is multiplication of p and q: "+r);
    }

    int addition(int  a, int b){
        int c=a+b;
        System.out.println("Addition of 'a' and 'b' two parameter :"+c);
        return c;
    }

    public static void main(String[] args) {
        Program02 ref = new Program02();
        ref.rtrnNothing(2,2);
        ref.sub(43,21);
        ref.add(2,'a');
        ref.multiply(2,3);
        ref.addition(21,21);

    }
}
