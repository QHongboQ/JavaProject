package Project.Myfinal;

import java.util.Scanner;

public class GamePlay {
    private static final int NUMBER_OF_CHOICES = 4;

    public static void main(String[] args) {
        System.out.println("Welcome to Tic-Tac-Toe!");
        int choice = menu();

        BaseAI player1, player2;
        switch (choice) {
            case 1:
                player1 = new HumanPlayer();
                player2 = new RandomAI();
                break;
            case 2:
                player1 = new HumanPlayer();
                player2 = new LearningAI();
                break;
            case 3:
                player1 = new HumanPlayer();
                player2 = new HumanPlayer();
                break;
            case 4:
                player1 = new RandomAI();
                player2 = new LearningAI();
                System.out.println("How many rounds (max 99999999 rounds)?");
                int rounds = enterRounds();

                simulateGames(player1, player2, rounds);

                return; // Exit after simulation
            default:
                throw new IllegalArgumentException("Invalid game option selected.");
        }

        Game game = new Game(player1, player2, choice);
        int status = game.startGame();
        System.out.println("Result: " + (status == 1 ? "Player 1 wins!" : status == 2 ? "Player 2 wins!" : "It's a draw!"));
    }

    private static int enterRounds() {
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input, please enter a number.");
            scanner.next(); // Consume the non-integer input
        }

        int rounds = scanner.nextInt();

        while (rounds < 1 || rounds > 99999999) {
            System.out.println("Invalid choice, try again (1-99999999).");
            rounds = scanner.nextInt();
        }

        return rounds;
    }

    private static int menu() {
        displayMenu();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        while (choice < 1 || choice > NUMBER_OF_CHOICES) {
            System.out.println("Invalid choice, try again.");
            displayMenu();
            choice = scanner.nextInt();
        }
        return choice;
    }

    private static void displayMenu() {
        System.out.println("1: HumanPlayer Versus RandomAI");
        System.out.println("2: HumanPlayer Versus LearningAI");
        System.out.println("3: HumanPlayer Versus Another Human Player");
        System.out.println("4: RandomAI vs LearningAI and Learn (max 99999 round)");
        System.out.printf("Choose an option 1-%d: ", NUMBER_OF_CHOICES);
    }

    public static void simulateGames(BaseAI player1, BaseAI player2, int numberOfGames) {
        Game game;
        for (int i = 0; i < numberOfGames; i++) {
            game = new Game(player1, player2, numberOfGames); // Create a new game instance
            int result = game.startGame();
            System.out.println("Game " + (i + 1) + ": " + (result == 0 ? "Draw" : "Player " + result + " wins"));
        }
    }
}
