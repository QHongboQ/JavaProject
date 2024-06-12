package Project.finalproject;

import java.util.ArrayList;

public class GameBoard {
    private String[][] board = new String[3][3];
    public GameBoard() {
        resetBoard();
    }

   public String getBoard(){
        //parse the board into a string and then return it
        String boardString = "";
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                boardString += board[i][j];
            }
        }
        return boardString;
    }

    public ArrayList<Integer> getPossibleMoves() {
        ArrayList<Integer> possibleMoves = new ArrayList<Integer>();
        //iterate through the board and add the index of the empty cells to the possibleMoves list
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                //check if the cell is empty
                if (board[i][j].equals("_")) {
                    //add the index of the cell to the possibleMoves list
                    possibleMoves.add(i * 3 + j);
                }
            }
        }
        return possibleMoves;
    }

    public void resetBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = "_";
            }
        }
    }

    public void makeMove(int move, boolean playerTurn) {
        int row = move / 3;
        int col = move % 3;
        if (playerTurn) {
            board[row][col] = "X";
        } else {
            board[row][col] = "O";
        }
    }

    public boolean isGameOver(){
        //check win condition for tic tac toe
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if (!board[i][0].equals("_") && board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2])) {
                return true;
            }
            if (!board[0][i].equals("_") && board[0][i].equals(board[1][i]) && board[1][i].equals(board[2][i])) {
                return true;
            }
        }
        // Check diagonals
        if (!board[0][0].equals("_") && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) {
            return true;
        }
        if (!board[0][2].equals("_") && board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])) {
            return true;
        }
        return false;
    }

    public int getUserMove(){
        //get user input for move
        return 0;
    }

    public void displayBoard(){
        //display the board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

}
