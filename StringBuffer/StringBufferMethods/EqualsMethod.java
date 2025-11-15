package StringBuffer.StringBufferMethods;

public class EqualsMethod {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("deepak");
        StringBuffer sb2 = new StringBuffer("deepak");
        StringBuffer sb3 = sb1.append("hii");


        System.out.println(sb1.equals(sb2));
        System.out.println(sb3.equals(sb1));
    }
}
