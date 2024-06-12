package zyBook_Chapter_7;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class zyBook_7_3 {
    /**
     This program shows the first nine lines of a file that was
     selected with a file chooser.
     */
    public static void main(String[] args) throws IOException
    {
        // Define a Dialog
        JFileChooser chooser = new JFileChooser();
        Scanner in = null;
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = chooser.getSelectedFile();
            in = new Scanner(selectedFile);

            // Print the result from 1 line to 9 line
            int lineNumber = 1;
            final int MAX_LINES = 9;
            while (in.hasNextLine() && lineNumber <= MAX_LINES)
            {
                String line = in.nextLine();
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }
            if (in.hasNextLine()) { System.out.println("..."); }
        }
    }
}
