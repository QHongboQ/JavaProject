package zyBook_Chapter_6;
import java.util.Arrays;

public class zyBook_6_7_4 {
    public class ArrayUtils
    {
        /**
         * Returns an array with the elements in reversed order.
         * @param words an array of String.
         * @return a new array as described here.
         */

        public static String[] reverse(String[] words)
        {
            String[] result = new String[words.length];
            for (int i = 0; i < words.length; i++)
            {
                result[words.length - i - 1] = words[i];
            }
            return result;
        }

    }


    public class Tester
    {
        public static void main(String[] args)
        {
            String[] in = {"mary", "had", "a", "little", "lamb"};
            String[] out = ArrayUtils.reverse(in);
            System.out.println("Input: " + Arrays.toString(in));
            System.out.println("Expected: [mary, had, a, little, lamb]");
            System.out.println("\nOutput: " + Arrays.toString(out));
            System.out.println("Expected: [lamb, little, a, had, mary]");
        }
    }
}
