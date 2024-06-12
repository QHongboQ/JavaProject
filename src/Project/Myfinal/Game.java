package Project.Myfinal;

import java.util.ArrayList;

public class Game {
    private Board board = new Board();
    private BaseAI player1;
    private BaseAI player2;
    private int gameOption;

    public Game(BaseAI player1, BaseAI player2, int gameOption) {
        this.player1 = player1;
        this.player2 = player2;
        this.gameOption = gameOption;
    }

    public int startGame() {
        int currentPlayer = 1;
        int[] lastState = null;

        System.out.println("Starting board:");
        displayBoard();

        while (board.getAvailableCells().size() > 0) {
            System.out.println("Player " + currentPlayer + "'s turn:");
            ArrayList<Integer> move = (currentPlayer == 1 ? player1 : player2).getMove(board);
            if (!move.isEmpty()) {
                lastState = board.getBoardState().clone();
                board.makeMove(move.get(0), currentPlayer);
                displayBoard();
            }

            if (board.checkWin()) {
                if (player2 instanceof LearningAI && currentPlayer == 1) {
                    ((LearningAI) player2).addLosingCombinationIfUnique(lastState);
                } else if (player1 instanceof LearningAI && currentPlayer == 2) {
                    ((LearningAI) player1).addLosingCombinationIfUnique(lastState);
                }
                return currentPlayer;
            }
            currentPlayer = 3 - currentPlayer;
        }
        return 0; // Draw
    }

    private void displayBoard() {
        int[] cells = board.getBoardState();
        for (int i = 0; i < cells.length; i++) {
            if (i % 3 == 0) System.out.println(); // New line for new row
            System.out.print((cells[i] == 0 ? "-" : (cells[i] == 1 ? "X" : "O")) + " ");
        }
        System.out.println();
    }
}
