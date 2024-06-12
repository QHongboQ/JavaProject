package zyBook_Chapter_6;
import java.util.Arrays;

public class zyBook_6_7_3 {

    public static class ArrayUtils {
        /**
         * Fills an array with a particular value.
         *
         * @param numbers the array of int
         * @param value   the value to store in each element.
         */

        public static void fill(int[] numbers, int value) {
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = value;
            }
        }


        public static void main(String[] args) {
            int[] a = new int[4];
            ArrayUtils.fill(a, 3);
            System.out.println("fill(a, 3): " + Arrays.toString(a));
            System.out.println("Expected: [3, 3, 3, 3]");

            a = new int[2];
            ArrayUtils.fill(a, 42);
            System.out.println("\nfill(a, 42): " + Arrays.toString(a));
            System.out.println("Expected: [42, 42]");

            a = new int[0];
            ArrayUtils.fill(a, -1);
            System.out.println("\nfill(a, -1): " + Arrays.toString(a));
            System.out.println("Expected: []");
        }
    }
}