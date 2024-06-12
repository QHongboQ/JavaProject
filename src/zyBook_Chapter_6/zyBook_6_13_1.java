package zyBook_Chapter_6;

public class zyBook_6_13_1 {
    /* Two-dimensional arrays
      final int COUNTRIES = 8;
      final int MEDALS = 3;
      int[][] counts = new int[COUNTRIES][MEDALS];
      Alternatively, you can declare and initialize the array by grouping each row:
      int[][] counts =
         {
            { 0, 3, 0 },
            { 0, 0, 1 },
            { 0, 0, 1 },
            { 1, 0, 0 },
            { 0, 0, 1 },
            { 3, 1, 1 },
            { 0, 1, 0 }
            { 1, 0, 1 }
         };
     */

    /*Accessing Elements
    for (int i = 0; i < COUNTRIES; i++)
    {
    // Process the ith row
    for (int j = 0; j < MEDALS; j++)
    {
         // Process the jth column in the i th row
         System.out.printf("%8d", counts[i][j]);
     }
     System.out.println(); // Start a new line at the end of the row
}
     */

    public static class Tables
    {
        public static double cornerAverage(double[][] values)
        {
            int rows = values.length;
            int columns = values[0].length;
            double sum = 0;
            /* Your code goes here */
            for(int i = 0; i < rows; i++)
            {
                for (int j = 0; j < columns; j ++)
                {
                    if ((i == 0 && j == 0) || (i == 0) && (j == columns-1) || (i == rows - 1) && (j == 0) || (i == rows - 1) && (j == columns-1)  )
                    {
                        sum += values[i][j];
                    }
                }
            }
            return sum / 4;
        }
    }

    // Complete this code to compute the average of the four corner elements of the given two-dimensional array.
    public static void main(String[] args)
    {
        double[][] a = { { 3, 1, 4 }, { 1, 5, 9 } };
        System.out.println(Tables.cornerAverage(a));
        System.out.println("Expected: 4.25");

        double[][] b = { { 3, 1 }, { 4, 1 }, { 5, 9 } };
        System.out.println(Tables.cornerAverage(b));
        System.out.println("Expected: 4.5");

        double[][] c = { { 3, 1, 4 }, { 1, 5, 9 }, { 2, 6, 5 } };
        System.out.println(Tables.cornerAverage(c));
        System.out.println("Expected: 3.5");
    }
}
