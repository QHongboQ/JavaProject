package zyBook_Chapter_5;
import java.util.Scanner;

public class zyBook_5_8_1
{
    /**
     Prompts a user to enter a value within a given range until the user
     provides a valid input.
     @param in the scanner to read from
     @param low the smallest allowable input
     @param high the largest allowable input
     @return the value provided by the user (between low and high, inclusive)
     */
    public static int readIntBetween(Scanner in, int low, int high)
    {
        int input;
        do
        {
            System.out.print("Enter a value between " + low
                    + " and " + high + ": ");
            input = in.nextInt();
        }
        while (input < low || input > high);
        return input;
    }

    public static void main(String[] args)
    {
        System.out.println("Please enter a time; hours, then minutes.");
        Scanner in = new Scanner(System.in);
        int hours = readIntBetween(in, 0, 23);
        int minutes = readIntBetween(in, 0, 59);
        System.out.printf("You entered %d hours and %d minutes.%n",
                hours, minutes);
    }
}
