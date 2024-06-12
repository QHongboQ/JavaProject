package Project;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class zyBook_35_6 {
    public static void main(String[] args) throws IOException {
        // Define the input as a file and stream
        Scanner scnr = new Scanner(System.in);
        String fileName = scnr.nextLine();
        FileInputStream fileStream = new FileInputStream(fileName);
        Scanner fileScanner = new Scanner(fileStream);

        // Define initial string data as empty
        String currentMovie = "";
        String currentRating = "";
        ArrayList<String> showTimes = new ArrayList<>();

        // When data exist, go into the loop
        while (fileScanner.hasNextLine()) {
            // read the line
            String line = fileScanner.nextLine();
            // When find a ,
            // Get the subsets and put them into a new string
            int commaIndex = line.indexOf(',');  // Return the first position of comma
            if (commaIndex != -1) { // When the first comma exist, enter this if()
                // Read the data and get the subset after this comma
                String showTime = line.substring(0, commaIndex);
                line = line.substring(commaIndex + 1);
                //Find again
                commaIndex = line.indexOf(',');
                if (commaIndex != -1) {
                    String title = line.substring(0, commaIndex);
                    String rating = line.substring(commaIndex + 1);

                    // If the movie not change, so it's a same line, just add the time to this movie
                    if (title.equals(currentMovie)) {
                        showTimes.add(showTime);
                    } else {    // If the movie is different, we begin at a new line
                        if (!currentMovie.isEmpty()) {
                            printMovieData(currentMovie, currentRating, showTimes);
                        }
                        // Add those things to our String
                        currentMovie = title;
                        currentRating = rating;
                        // Reset the showTimes list
                        showTimes = new ArrayList<>();
                        showTimes.add(showTime);
                    }
                }
            }
        }

        // Print the last movie
        if (!currentMovie.isEmpty()) {
            printMovieData(currentMovie, currentRating, showTimes);
        }
        fileScanner.close();
        fileStream.close();
    }

    // Print the result using require condition
    public static void printMovieData(String title, String rating, ArrayList<String> showTimes) {
        // When the name is large the 44 character, only print the first 44 character
        if (title.length() > 44) {
            title = title.substring(0, 44);
        }
        // Print the space
        System.out.printf("%-44s | %5s | ", title, rating);

        // Print all the time according the size of the arrayList
        for (int i = 0; i < showTimes.size(); i++) {
            System.out.print(showTimes.get(i));
            if (i < showTimes.size() - 1) {
                System.out.print(" ");
            }
        }
        // Begin a new line
        System.out.println();
    }
}

/*
 * input:
 * C:\NoSystemFile\JavaProject\ClassCS003B\src\Project\movies.csv
 * output:
 * Wonders of the World                         |     G | 16:40 20:00
 * Journey to Space                             | PG-13 | 19:00
 * Buffalo Bill And The Indians or Sitting Bull |    PG | 12:45 15:00 19:30
 * Adventures of Lewis and Clark                | PG-13 | 10:00 14:30
 * Halloween                                    |     R | 19:00
 */
