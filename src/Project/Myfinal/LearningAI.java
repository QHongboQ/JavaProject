package Project.Myfinal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.io.*;

public class LearningAI extends BaseAI {
    private HashSet<String> losingCombinations = new HashSet<>();
    private Random random = new Random();
    private final String stateFilePath = "./LearningAIHistory.txt";

    public LearningAI() {
        loadLosingCombinations();
    }

    @Override
    public ArrayList<Integer> getMove(Board board) {
        ArrayList<Integer> availableMoves = board.getAvailableCells();

        if (availableMoves.isEmpty()) {
            return new ArrayList<>(); // No available moves
        }

        // Attempt to find a safe move
        ArrayList<Integer> safeMoves = new ArrayList<>();

        for (int cell : availableMoves) {
            int[] potentialState = board.getBoardState().clone();
            potentialState[cell] = 2; // Assuming AI is player 2
            if (!isLosingMove(potentialState)) {
                safeMoves.add(cell);
            }
        }

        // If there are safe moves, choose one at random
        if (!safeMoves.isEmpty()) {
            return new ArrayList<>(Arrays.asList(safeMoves.get(random.nextInt(safeMoves.size()))));
        }

        // If no safe moves, pick a random move
        return new ArrayList<>(Arrays.asList(availableMoves.get(random.nextInt(availableMoves.size()))));
    }

    // check if this step whether exist in the txt file
    private boolean isLosingMove(int[] state) {
        String stateKey = Arrays.toString(state);
        return losingCombinations.contains(stateKey);
    }

    // If the loss round is unique, add into the txt file
    public void addLosingCombinationIfUnique(int[] state) {
        String stateKey = Arrays.toString(state);
        if (losingCombinations.add(stateKey)) {  // Returns true if this set did not already contain the specified element
            saveLosingCombination(stateKey);
        }
    }

    // Loading the txt file
    private void loadLosingCombinations() {
        File file = new File(stateFilePath);
        if (!file.exists()) {
            try {
                // If the file does not exist, create a new file
                if (file.createNewFile()) {
                    System.out.println("Created new file for losing combinations at " + file.getAbsolutePath());
                    return; // New file created, no data read
                } else {
                    System.out.println("Failed to create new file for losing combinations.");
                }
            } catch (IOException e) {
                System.err.println("Error creating the losing combinations file: " + e.getMessage());
                return; // Failed to create the file, terminate the method execution
            }
        }

        // If the file exists, try to read its contents
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                losingCombinations.add(line.trim());
            }
        } catch (IOException e) {
            System.err.println("Error reading losing combinations file: " + e.getMessage());
        }
    }


    private void saveLosingCombination(String state) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(stateFilePath, true))) {
            writer.write(state);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Error writing to losing combinations file: " + e.getMessage());
        }
    }
}