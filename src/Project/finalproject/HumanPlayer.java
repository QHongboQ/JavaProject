package Project.finalproject;

import java.util.ArrayList;
public class HumanPlayer extends BaseAI{
    public int getMove(GameBoard gameBoard){
        return gameBoard.getUserMove();
    }
}
