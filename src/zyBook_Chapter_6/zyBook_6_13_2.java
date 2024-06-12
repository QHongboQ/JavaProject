package zyBook_Chapter_6;

public class zyBook_6_13_2 {
    public static class Data
    {
        private int[][] values;

        /**
         Computes the sum of a given row in a two-dimensional array.
         @param row whose sum to compute
         @return the sum of the given row
         */
        public int rowSum(int row)
        {
            int sum = 0;
            /* Your code goes here */
            for (int i = 0; i < values[row].length; i++)
            {
                sum += values[row][i];
            }
            return sum;
        }

        public Data(int[][] data) { values = data; }
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

        Data dataSet1 = new Data(counts);
        int sum = dataSet1.rowSum(5);
        System.out.println(sum);
        System.out.println("Expected: 2");

        int[][] magicSquare = {
                { 16, 3, 2, 13 },
                { 5, 10, 11, 8 },
                { 9, 6, 7, 12 },
                { 4, 15, 14, 1 },
        };

        Data dataSet2 = new Data(magicSquare);
        for (int row = 0; row <= 3; row++)
        {
            System.out.println(dataSet2.rowSum(row));
            System.out.println("Expected: 34");
        }
    }
}
