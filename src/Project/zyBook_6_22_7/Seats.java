package Project.zyBook_6_22_7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JFileChooser;


public class Seats{
    private Seat[][] seats;
    public static int NUMBER_ROWS = 9;
    public static final int NUMBER_COLUMNS = 10;
    public ArrayList<Integer> prices;


    // Scanner in = new Scanner(System.in);
    public Seats(){
        seats = new Seat[NUMBER_ROWS][NUMBER_COLUMNS];
        ArrayList<String> data = readFile();
        initializeArray(data);
        prices = differentPrices();
    }

    public ArrayList<Integer> returnPrice()
    {
        return prices;
    }

    public ArrayList<Integer> removeDuplicates() {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < NUMBER_ROWS; i++) {
            for (int j = 0; j < NUMBER_COLUMNS; j++) {
                set.add(seats[i][j].getPrice());
            }
        }
        return new ArrayList<>(set);
    }

    public ArrayList<Integer> differentPrices(){
        return removeDuplicates();
    }


    /**
     * Read the file and store the data in an ArrayList
     */
    public static ArrayList<String> readFile(){
        ArrayList<String> data = new ArrayList<String>();

        JFileChooser chooser = new JFileChooser();
        Scanner in = null;
        try{
            if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
            {
                File selectedFile = chooser.getSelectedFile();
                in = new Scanner(selectedFile);
                while (in.hasNextLine()){
                    data.add(in.nextLine());
                }
            }
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        finally{
            if (in != null)
                in.close();
        }


        return data;
    }
    
    public void initializeArray(ArrayList<String> data){
        for (int i = 0; i < NUMBER_ROWS; i++) {
            String[] row = data.get(i).split(",");
            for (int j = 0; j < NUMBER_COLUMNS; j++) {
                int price = Integer.parseInt(row[j]);
                seats[i][j] = new Seat(price);
            }
        }

    }

    public void display(){
        for (int i = 0; i < NUMBER_ROWS; i++) {
            for (int j = 0; j < NUMBER_COLUMNS; j++) {
                if (seats[i][j].isAvailable())
                    System.out.print(seats[i][j].getPrice() + " ");
                else{
                    System.out.print("X  ");
                }
            }
            System.out.println();
        }
    }

    public Seat[][] getSeats(){
        return seats;
    }

    public void takeSeat(int row, int column){
        seats[row][column].setAvailable(false);
    }

}
