package StringBuffer.StringBufferMethods;

public class CapacityMethod {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());

        //default capacity of StringBuffer = 16
        //formula  => (oldCapacity * 2)+2  OR  (oldCapacity + 1)*2

        sb.append("Hello");
        System.out.println(sb.capacity());//16

        sb.append("Rushikesh Java");
        System.out.println(sb.capacity());//34
    }
}
