package Project.Myfinal;

import java.util.ArrayList;

public class Board {
    private int[] cells = new int[9];  // Example initialization
    private int moveCount = 0;// Initialize the move count

    /**
     * Returns a list of indices corresponding to empty cells on the board.
     *
     * @return ArrayList<Integer> available cells
     */
    public ArrayList<Integer> getAvailableCells() {
        ArrayList<Integer> available = new ArrayList<>();
        for (int i = 0; i < cells.length; i++) {
            if (cells[i] == 0) {
                available.add(i);
            }
        }
        return available;
    }

    /**
     * Updates the board state by marking a cell based on the player's move.
     *
     * @param cell the cell to mark
     * @param player the player making the move
     */
    public void makeMove(int cell, int player) {
        if (cells[cell] == 0) {
            cells[cell] = player;
            moveCount++; //Increase the count each time you move
        }
    }

    /**
     * Evaluates the board to determine if there is a winning configuration.
     *
     * @return boolean indicating if there is a win
     */
    public boolean checkWin() {
        int[][] winConditions = {
                {0, 1, 2}, {3, 4, 5}, {6, 7, 8},
                {0, 3, 6}, {1, 4, 7}, {2, 5, 8},
                {0, 4, 8}, {2, 4, 6}
        };
        for (int[] condition : winConditions) {
            if (cells[condition[0]] != 0 && cells[condition[0]] == cells[condition[1]] && cells[condition[1]] == cells[condition[2]]) {
                return true;
            }
        }
        return false;
    }

    public int getMoveCount() {
        return moveCount;
    }

    public int[] getBoardState() {
        return cells.clone();
    }

}