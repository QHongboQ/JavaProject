package zyBook_Chapter_6;
import java.util.Arrays;
import java.util.Scanner;

/**
 This program computes a final score for a series of quiz scores: the sum
 after dropping the lowest score. The program adapts the algorithm for
 computing the minimum.
 */
public class zyBook_6_9_1
{
    public static void main(String[] args)
    {
        double[] scores = readInputs();
        if (scores.length == 0)
        {
            System.out.println("At least one score is required.");
        }
        else
        {
            int pos = minimumPosition(scores);
            // Remove the element at this position--see Section 6.3.6
            int currentSize = scores.length;
            scores[pos] = scores[currentSize - 1];
            currentSize--;
            double total = sum(scores, currentSize);
            System.out.println("Final score: " + total);
        }
    }

    /**
     Reads a sequence of floating-point numbers.
     @return an array containing the numbers
     */
    public static double[] readInputs()
    {
        // Read the input values into an array

        final int INITIAL_SIZE = 10;
        double[] inputs = new double[INITIAL_SIZE];
        System.out.println("Please enter values, Q to quit:");
        Scanner in = new Scanner(System.in);
        int currentSize = 0;
        while (in.hasNextDouble())
        {
            // Grow the array if it has been completely filled

            if (currentSize >= inputs.length)
            {
                inputs = Arrays.copyOf(inputs, 2 * inputs.length);
            }
            inputs[currentSize] = in.nextDouble();
            currentSize++;
        }

        return Arrays.copyOf(inputs, currentSize);
    }

    /**
     Gets the position of the minimum value from an array.
     @param values an array of size >= 1
     @return the position of the smallest element of values
     */
    public static int minimumPosition(double[] values)
    {
        int smallestPosition = 0;
        for (int i = 1; i < values.length; i++)
        {
            if (values[i] < values[smallestPosition])
            {
                smallestPosition = i;
            }
        }
        return smallestPosition;
    }

    /**
     Computes the sum of the values in an array.
     @param values an array
     @param size the number of valid elements in the array
     @return the sum of the values in values
     */
    public static double sum(double[] values, int size)
    {
        double total = 0;
        for (int i = 0; i < size; i++)
        {
            total = total + values[i];
        }
        return total;
    }
}

