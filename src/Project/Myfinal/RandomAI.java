package Project.Myfinal;

import java.util.ArrayList;
import java.util.Random;

public class RandomAI extends BaseAI {
    private Random random = new Random();


    /**
     * Implements the abstract method from BaseAI to return a random move
     * from the list of available cells on the board.
     *
     * @param board the game board
     * @return ArrayList<Integer> next move
     */
    @Override
    public ArrayList<Integer> getMove(Board board) {
        ArrayList<Integer> availableCells = board.getAvailableCells();
        ArrayList<Integer> move = new ArrayList<>();
        if (!availableCells.isEmpty()) {
            move.add(availableCells.get(random.nextInt(availableCells.size())));
        }
        return move;
    }
}