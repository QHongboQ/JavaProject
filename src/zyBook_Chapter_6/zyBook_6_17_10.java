package zyBook_Chapter_6;

public class zyBook_6_17_10 {
    public static class TicTacToe
    {
        /**
         * Return true if all elements on the diagonal joining the upper-left
         * and the lower-right corners all the same.
         * @param board a 3 x 3 array of String
         * @return true if all elements are the same.
         */
        public static boolean checkUpperLeftToLowerRight(String[][] board)
        {
            boolean result = false;
            if(board[0][0].equals(board[board.length - 1][board[0].length - 1]))
            {
                result = true;
            }
            return result;
        }
    }

    public static void main(String[] args)
    {
        String[][] board = {{"x","o","x"},{"x","x","o"},{"x", "o", "x"}};
        System.out.println("Checking:"); print(board);

        System.out.println("\ncheckUpperLeftToLowerRight(board): "
                + TicTacToe.checkUpperLeftToLowerRight(board));
        System.out.println("Expected: true");

        board = new String[][] {{"o","o","x"},{"x","x","o"},{"x", "o", "x"}};
        System.out.println("\nChecking:"); print(board);
        System.out.println("\ncheckUpperLeftToLowerRight(board): "
                + TicTacToe.checkUpperLeftToLowerRight(board));
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
