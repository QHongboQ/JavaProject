package zyBook_Chapter_7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class zyBook_7_1_1 {
    public static void main(String[] args) throws FileNotFoundException
    {
        // Read the input
        // Need
        // import java.io.PrintWriter;
        // import java.io.File;
        // import java.io.FileNotFoundException;

        //File inputFile = new File("input.txt");
        //Scanner in = new Scanner(inputFile);
        //write output
        //PrintWriter out = new PrinterWriter("output.txt");
        //in.close
        //out.close
        // When we have exception, the program cant run, so we change the main function
        // public static void main(String[] args) throws FileNotFoundException
/*
 This program reads a file with numbers, and writes the numbers to another
 file, lined up in a column and followed by their total.
 */
        // Prompt for the input and output file names

        Scanner console = new Scanner(System.in);
        System.out.print("Input file: ");
        String inputFileName = console.next();
        System.out.print("Output file: ");
        String outputFileName = console.next();

        // Construct the Scanner and PrintWriter objects for reading and writing

        File inputFile = new File(inputFileName);
        Scanner in = new Scanner(inputFile);
        PrintWriter out = new PrintWriter(outputFileName);

        // Read the input and write the output

        double total = 0;

        while (in.hasNextDouble())
        {
            double value = in.nextDouble();
            out.printf("%15.2f%n", value);
            total = total + value;
        }

        out.printf("Total: %8.2f%n", total);

        in.close();
        out.close();
        }
    }
