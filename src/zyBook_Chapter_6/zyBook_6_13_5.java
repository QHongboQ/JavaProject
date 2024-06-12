package zyBook_Chapter_6;

public class zyBook_6_13_5 {
    public static class TicTacToe
    {
        /**
         * Return true if all elements in col are the same.
         * @param board a 3 x 3 array of String
         * @param col the column to check
         * @return true if all elements are the same.
         */
        public static boolean checkCol(String[][] board, int col)
        {
            boolean bool = true;
            String firstElement = board[0][col];
                for ( int j = 0; j < board.length; j++)
                {
                    if (!firstElement.equals(board[j][col])) {
                        bool = false;
                        break;
                    }
                }

            return bool;
        }
    }


    public static void main(String[] args)
    {
        String[][] board = {{"x","o","x"},{"x","x","o"},{"x", "o", "x"}};
        System.out.println("Checking this board:");
        print(board);

        System.out.println("\ncheckCol(board, 0): " + TicTacToe.checkCol(board, 0));
        System.out.println("Expected: true");
        System.out.println("\ncheckCol(board, 1): " + TicTacToe.checkCol(board, 1));
        System.out.println("Expected: false");
        System.out.println("\ncheckCol(board, 2): " + TicTacToe.checkCol(board, 2));
        System.out.println("Expected: false");
    }
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
        for (int i = 0; i < col; i++) { System.out.print("+---"); }
        System.out.println("+");
    }

    public static void printRow(String[] r)
    {
        for (int i = 0; i < r.length; i++) { System.out.printf("| %s ", r[i]); }
        System.out.println("|");
    }
}
