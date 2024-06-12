package zyBook_Chapter_6;

public class zyBook_6_17_3 {

        public static void main(String[] args)
        {
            String[][] board =
                    {
                            {"x", "o", "x"},
                            {"o", "o", " "} ,
                            {" ", "x", " "},
                    };

            Util2D.print(board);
        }

    public static class Util2D
    {
        public static void print(String[][] board)
        {
            int rows = board.length;
            int cols = rows > 0 ? board[0].length : 0;

            for (int r = 0; r < rows; r++)
            {
                printSep(cols);
                printRow(board[r]);
            }
            printSep(cols);
        }

        public static void printSep(int col)
        {
            for (int i = 0; i < col; i++)
            {
                System.out.print("+---");
            }
            System.out.println("+");
        }

        public static void printRow(String[] r)
        {
            for (int i = 0; i < r.length; i++)
            {
                System.out.printf("| %s ", r[i]);
            }
            System.out.println("|");
        }
    }
}
