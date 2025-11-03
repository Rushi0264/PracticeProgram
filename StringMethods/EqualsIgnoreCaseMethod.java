package StringMethods;

public class EqualsIgnoreCaseMethod {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "java";

        //System.out.println(str1.equalsIgnoreCase(str2));
        if (str1.equalsIgnoreCase(str2)){
            System.out.println("Both string content are equals");
        }else {
            System.out.println("Both string content are different");
        }
    }
}
