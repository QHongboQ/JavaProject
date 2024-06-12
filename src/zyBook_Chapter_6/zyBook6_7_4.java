package zyBook_Chapter_6;

public class zyBook6_7_4 {
    public static class ArrayUtils
    {
        /**
         * Returns an int array of length len, with 0 >= values < n.
         * @param len the size of the returned array.
         * @param n the upper (excluded) bounds of the random numbers.
         * @return the array as described here.
         */

        public static int[] randomInts(int len, int n)
        {
            int[] array = new int[len];

            for (int i = 0; i < len; i++)
            {
                array[i] = (int)(Math.random() * n);
            }

            return array;
        }
    }

    public static class Tester
    {
        public static boolean isValid(int[] a, int upper)
        {
            for (int n : a) if (n < 0 || n >= upper) return false;
            for (int n : a) if (n != 0) return true;
            return false;
        }

        public static void main(String[] args)
        {
            int[] a = ArrayUtils.randomInts(4, 7);
            System.out.println("randomInts(4, 7).length: " + a.length);
            System.out.println("Expected: 4");
            System.out.println("\nAll numbers valid: " + isValid(a, 7));
            System.out.println("Expected: true");

            a = ArrayUtils.randomInts(12, 2);
            System.out.println("\nrandomInts(12, 2).length: " + a.length);
            System.out.println("Expected: 12");
            System.out.println("\nAll numbers valid: " + isValid(a, 2));
            System.out.println("Expected: true");
        }
    }
}
