package zyBook_Chapter_6;

public class zyBook_6_17_2 {
        public static void main(String[] args)
        {
            int[][] board = new int[8][8];

            for (int i = 0; i < 8; i++)
            {
                for (int j = 0; j < 8; j++)
                {
                    if(i % 2 == 0)
                    {
                        if(j % 2 == 0)
                        {
                            board[i][j] = 0;
                        }else
                        {
                            board[i][j] = 1;
                        }
                    }else
                    {
                        if(j % 2 != 0)
                        {
                            board[i][j] = 0;
                        }else
                        {
                            board[i][j] = 1;
                        }
                    }
                }
            }

            Util2D.print(board);
        }

    public static class Util2D
    {
        public static void print(int[][] board)
        {
            int rows = board.length;
            int cols = board[0].length;

            for (int r = 0; r < rows; r++)
            {
                printRow(board[r]);
            }
        }

        public static void printRow(int[] r)
        {
            for (int i = 0; i < r.length; i++)
            {
                System.out.printf(" %d ", r[i]);
            }
            System.out.println();
        }
    }
}
