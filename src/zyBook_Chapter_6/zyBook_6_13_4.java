package zyBook_Chapter_6;

public class zyBook_6_13_4 {
    public static class ArrayUtil
    {
        /**
         Computes the sum of a given row in a two-dimensional array.
         @param values the array
         @param  row whose sum to compute
         @return the sum of the given row
         */

        public static int rowSum(int[][] values, int row)
        {
            int sum = 0;
            /* Your code goes here */
            for (int i = 0; i < values[0].length; i++)
            {
                sum += values[row][i];
            }
            return sum;
        }

    }

    public static void main(String[] args)
    {

        int[][] counts =
                {
                        { 1, 0, 1 },
                        { 1, 1, 0 },
                        { 0, 0, 1 },
                        { 1, 0, 0 },
                        { 0, 1, 1 },
                        { 0, 1, 1 },
                        { 1, 1, 0 }
                };
        int sum = ArrayUtil.rowSum(counts, 5);
        System.out.println(sum);
        System.out.println("Expected: 2");

        int[][] magicSquare = {
                { 16, 3, 2, 13 },
                { 5, 10, 11, 8 },
                { 9, 6, 7, 12 },
                { 4, 15, 14, 1 },
        };

        for (int row = 0; row <= 3; row++)
        {
            System.out.println(ArrayUtil.rowSum(magicSquare, row));
            System.out.println("Expected: 34");
        }
    }
}
