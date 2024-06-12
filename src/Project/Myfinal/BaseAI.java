package Project.Myfinal;

import java.util.ArrayList;

public abstract class BaseAI {
    /**
     * This method should be implemented by all subclasses to determine
     * the next move based on the current board state. It returns an ArrayList
     * containing the indices of available moves.
     *
     * @param board the game board
     * @return ArrayList<Integer> representing available move indices
     */
    public abstract ArrayList<Integer> getMove(Board board);
}