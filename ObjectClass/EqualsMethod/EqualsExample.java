package ObjectClass.EqualsMethod;

public class EqualsExample {
    public static void main(String[] args) {
        String str1 =new String("Java");
        String str2 =new String("Java");

        if (str1 == str2){
            System.out.println("Both reference are equals..");
        }
        else {
            System.out.println("Both reference are different..");
        }

        if (str1.equals(str2)){
            System.out.println("Both content are same");
        }
        else {
            System.out.println("Both content are same");
        }
    }
}
