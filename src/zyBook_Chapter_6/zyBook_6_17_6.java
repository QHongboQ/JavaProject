package zyBook_Chapter_6;

public class zyBook_6_17_6 {
    public class Tables
    {
        public static double evenElements(double[][] values)
        {
            int rows = values.length;
            int columns = values[0].length;
            int count = 0;

            for (int i = 0; i < rows; i++)
            {
                for(int j = 0; j < columns; j++)
                {
                    if(values[i][j] % 2 == 0)
                    {
                        count++;
                    }
                }
            }

            return count;
        }
    }

    public static void main(String[] args)
    {
        double[][] a = { { 3, 1, 4 }, { 1, 5, 9 } };
        System.out.println(Tables.evenElements(a));
        System.out.println("Expected: 1");

        double[][] b = { { 3, 1 }, { 4, 1 }, { 5, 9 } };
        System.out.println(Tables.evenElements(b));
        System.out.println("Expected: 1");

        double[][] c = { { 3, 1, 4 }, { 1, 5, 9 }, { 2, 6, 5 } };
        System.out.println(Tables.evenElements(c));
        System.out.println("Expected: 3");
    }
}
