package StringMethods.ExerciseOnString;
import java.util.Calendar;

public class GetByteArrFromString {
    public static void main(String[] args) {
        String str1 = "Hello Java";

        byte[] byteArr = str1.getBytes();
        String newStr = new String(byteArr);

        System.out.println("The new string equals : "+newStr);
    }
}
