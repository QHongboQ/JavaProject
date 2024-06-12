package zyBook_Chapter_6;
import java.util.Arrays;

public class zyBook_6_17_8 {
    public static class Data
    {
        private int[][] values;

        /**
         Fills a given column of a two-dimensional array with a given value.
         @param column the column to fill
         @param fillValue the value to fill it with
         */
        public void fillColumn(int column, int fillValue)
        {

            /* Your code goes here */
            for(int i = 0; i <= values.length - 1; i++)
            {
                values[i][column] = fillValue;
            }

        }

        public Data(int[][] data) { values = data; }
    }

    public static void main(String[] args)
    {
        int[][] matrix =
                {
                        { 1, 0 },
                        { 0, 1 },
                        { 1, 0 },
                        { 0, 1 }
                };

        Data dataSet = new Data(matrix);
        dataSet.fillColumn(0, 2);
        System.out.println(Arrays.deepToString(matrix));
        System.out.println("Expected: [[2, 0], [2, 1], [2, 0], [2, 1]]");
        dataSet.fillColumn(1, 3);
        System.out.println(Arrays.deepToString(matrix));
        System.out.println("Expected: [[2, 3], [2, 3], [2, 3], [2, 3]]");
    }
}
