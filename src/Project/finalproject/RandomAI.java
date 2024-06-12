package Project.finalproject;

import java.util.ArrayList;


public class RandomAI extends BaseAI{
    
    public int getMove(GameBoard gameboard){
        ArrayList<Integer> possibleMoves = gameboard.getPossibleMoves();
        
        //pick random move among possible moves
        int randomIndex = (int)(Math.random() * possibleMoves.size());
        return possibleMoves.get(randomIndex);
    }
}
