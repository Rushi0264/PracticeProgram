package StringMethods.ExerciseOnString;
import java.util.Calendar;

public class CurrentDateTime {
    public static void main(String[] args) {
        Calendar c =Calendar.getInstance();
        System.out.println("Current date and time");

        System.out.format("%tb %te, %ty%n", c, c, c);
        System.out.format("%tl:%tM %tp%n", c, c, c);
    }
}
