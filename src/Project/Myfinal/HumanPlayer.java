package Project.Myfinal;

import java.util.ArrayList;
import java.util.Scanner;

public class HumanPlayer extends BaseAI {
    private String name;
    private Scanner scanner = new Scanner(System.in);

    /**
     * Collects and validates the human player's move input from the console.
     *
     * @param board the game board
     * @return ArrayList<Integer> next move
     */
    @Override
    public ArrayList<Integer> getMove(Board board) {
        int move = -1;
        ArrayList<Integer> result = new ArrayList<>();
        do {
            System.out.print("Enter your move (1-9): ");
            if (scanner.hasNextInt()) {
                move = scanner.nextInt();
                if (move >= 1 && move <= 9 && board.getAvailableCells().contains(move - 1)) {
                    result.add(move - 1);
                    break;
                }
            } else {
                scanner.next(); // Clear the invalid input
            }
            System.out.println("Invalid move. Please try again.");
        } while (true);
        return result;
    }

    /**
     * Returns the name of the human player.
     *
     * @return name of the player
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the human player.
     *
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}