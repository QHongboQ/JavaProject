package Project.finalproject;

public class Game {

    private BaseAI player1;
    private BaseAI player2;
    public GameBoard gameBoard;

    public Game(BaseAI player1, BaseAI player2, int gameOption) {
        this.player1 = player1;
        this.player2 = player2;
        gameBoard = new GameBoard();
    }

    public void startGame(){
        while(!gameBoard.isGameOver()){
            gameBoard.displayBoard();
            gameBoard.makeMove(player1.getMove(gameBoard), true);
            if(gameBoard.isGameOver()){
                break;
            }
            gameBoard.displayBoard();;
            gameBoard.makeMove(player2.getMove(gameBoard), false);
        }
    }
}
