package ArrayWithLoops;
import java.util.Arrays;
public class ExampleWithSortFunction {
    public static void main(String[] args) {
        // List of product prices (in rupees)
        int[] prices = {499, 299, 999, 199, 799, 699, 399};

        // Display original prices
        System.out.println("Before sorting (original prices): " + Arrays.toString(prices));

        // Sort prices in ascending order (low to high)
        Arrays.sort(prices);

        // Display sorted prices
        System.out.println("After sorting (low to high): " + Arrays.toString(prices));
    }
}
