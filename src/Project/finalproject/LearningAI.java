package Project.finalproject;

import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.Random;

public class LearningAI extends BaseAI{
    ArrayList<String> lostGames;

    public LearningAI(){
        openFile();
    }
    public int getMove(GameBoard gameBoard){
        //Among possible moves, avoid losing moves
        ArrayList<Integer> possibleMoves = gameBoard.getPossibleMoves();
        for(int i = 0; i < possibleMoves.size(); i++){
            GameBoard newGameBoard = new GameBoard();
            newGameBoard.makeMove(possibleMoves.get(i), true);
            if(newGameBoard.isGameOver()){
                possibleMoves.remove(i);
                i--;
            }
        }
        //If there are no possible moves, pick a random move
        if(possibleMoves.size() == 0){
            return (int)(Math.random() * 9);
        }
        //Pick a random move among the possible moves
        int randomIndex = (int)(Math.random() * possibleMoves.size());
        return possibleMoves.get(randomIndex);
    }

    public void openFile(){
        //open file called LearningAIHistory.txt
        //if file does not exist, create it
        File file = new File("LearningAIHistory.txt");
        if(!file.exists()){
            try{
                file.createNewFile();
            }catch(IOException e){
                e.printStackTrace();
            }
        }

        //read the file and store the lost games in lostGames
        try{
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                lostGames.add(scanner.nextLine());
            }
            scanner.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        



    }

    public void update(GameBoard gameBoard){
        try{
            FileWriter writer = new FileWriter("LearningAIHistory.txt");
            writer.write(gameBoard.getBoard());
            writer.write("\n");
            writer.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        




    }
}
