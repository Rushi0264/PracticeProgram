package ObjectClass.EqualsMethod;

public class CompareTwoString {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("JAVA");

        if (s1 == s2){
            System.out.println("Both references are same");
        }
        else {
            System.out.println("Both references are different");
        }

        if (s1.equalsIgnoreCase(s2)){
            System.out.println("Both content are same, Ignore case");
        }
        else {
            System.out.println("Both content are different");
        }
    }
}
