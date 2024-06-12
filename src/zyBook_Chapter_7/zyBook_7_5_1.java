package zyBook_Chapter_7;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class zyBook_7_5_1 {
    //Only read the letters.
    //Scanner in = new Scanner(. . .);
    //in.useDelimiter("[^A-Za-z]+");

    //Only read a character
    //Scanner in = new Scanner(. . .);
    //in.useDelimiter("");

    //To check the type of character
    //Character.isDigit(input)
    //Character.isLetter(input)
    //Character.isUpperCase(input)
    //Character.isLowerCase(input)
    //Character.isWhitespace(input)

    public static void main(String[] args) throws FileNotFoundException {
        // Define a Dialog
        JFileChooser chooser = new JFileChooser();
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File selectedFile = chooser.getSelectedFile();
            Scanner in = new Scanner(selectedFile);

            /* Normal way to define a input
            Scanner console = new Scanner(System.in);
            System.out.print("Input file: ");
            String inputFileName = console.next();
            File inputFile = new File(inputFileName);
            Scanner in = new Scanner(inputFile);
            */

            in.useDelimiter("");
            int uppercase = 0;
            int lowercase = 0;
            int digits = 0;
            int whitespace = 0;
            int other = 0;

            // When we have a input of String type, enter the loop
            while (in.hasNext()) {
                // The input char is (the character of index 0 of the input)
                char input = in.next().charAt(0);
                if (Character.isUpperCase(input)) {
                    uppercase++;
                } else if (Character.isLowerCase(input)) {
                    lowercase++;
                } else if (Character.isDigit(input)) {
                    digits++;
                } else if (Character.isWhitespace(input)) {
                    whitespace++;
                } else other++;
            }

            /* Your code goes here */

            System.out.println("Uppercase: " + uppercase);
            System.out.println("Lowercase: " + lowercase);
            System.out.println("Digits: " + digits);
            System.out.println("Whitespace: " + whitespace);
            System.out.println("Other: " + other);
        }
    }

}
