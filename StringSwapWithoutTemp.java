public class StringSwapWithoutTemp {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Programing";

        System.out.println("Before Swap:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        // Swapping logic without using third variable
        str1 = str1 + str2;
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());

        System.out.println("\nAfter Swap:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
