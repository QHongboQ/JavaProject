package zyBook_Chapter_6;
import java.util.Arrays;

public class zyBook_6_7_5 {
    public static class ArrayUtils
    {
        /**
         * Reverses the order of the elements in an array.
         * @param words an array of String to reverse.
         */

        public static void reverse(String[] words)
        {
            int start = 0;
            int end = words.length - 1;

            while (start < end) {
                String temp = words[start];
                words[start] = words[end];
                words[end] = temp;

                start++;
                end--;
            }
        }

    }

    public static class Tester
    {
        public static void main(String[] args)
        {
            String[] a = {"mary", "had", "a", "little", "lamb"};
            ArrayUtils.reverse(a);
            System.out.println("After: " + Arrays.toString(a));
            System.out.println("Expected: [lamb, little, a, had, mary]");
            ArrayUtils.reverse(a);
            System.out.println("\nReversed again: " + Arrays.toString(a));
            System.out.println("Expected: [mary, had, a, little, lamb]");

            ArrayUtils.reverse(a);
            System.out.println("\nAgain: " + Arrays.toString(a));
            System.out.println("Expected: [lamb, little, a, had, mary]");
        }
    }

    // input could be an array or an integer number
    //public static int sum(int... values)
    //{
    //   int total = 0;
    //   for (int i = 0; i < values.length; i++) // values is an int[]
    //   {
    //      total = total + values[i];
    //   }
    //   return total;
    //}
}
