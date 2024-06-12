package Project.finalproject;

public class GamePlay {
    public Game game;
    public static RandomAI randomAI;
    public static HumanPlayer humanPlayer;
    public static LearningAI learningAI;

    public static void main(String[] args) {
        randomAI = new RandomAI();
        humanPlayer = new HumanPlayer();
        learningAI = new LearningAI();
        System.out.println("Welcome to Tic Tac Toe!");
        Game game = new Game(randomAI, learningAI, 1);
        System.out.println("Game starting...");
        game.startGame();
    }
}
