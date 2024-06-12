package zyBook_Chapter_5;
import java.util.Scanner;
public class zyBook_5_2_3 {
    /**
     * Computes the area of a square of a given side length.
     * @param sideLength the length of a side
     * @return the area of a square with side length.
     */

    /* Your code goes here */
    public static double squareArea(double sideLength)
    {
        double area = sideLength * sideLength;
        return area; /* Your code goes here */
    }

    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        double area = squareArea(in.nextDouble());
        System.out.println(area);
    }
}
