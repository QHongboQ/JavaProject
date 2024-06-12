package zyBook_Chapter_6;
import java.util.Scanner;
import java.util.Arrays;

public class zyBook_6_1_2
{
    /**
     * In the following program,
     * print the sum of the first and last element in the partially filled array prices with companion variable numberOfPrices.
     * @param args
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        final int LENGTH = 100;
        double[] prices = new double[LENGTH];

        System.out.println("Enter prices, Q to finish:");
        int numberOfPrices = 0;
        while (in.hasNextDouble())
        {
            double price = in.nextDouble();

            if (numberOfPrices < LENGTH)
            {
                prices[numberOfPrices] = price;
                numberOfPrices++;
            }
        }

        double sum = prices[0] + prices[numberOfPrices - 1];

        System.out.printf("Sum of first and last: %.2f%n", sum);

    }
}