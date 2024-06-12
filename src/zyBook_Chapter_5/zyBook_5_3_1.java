package zyBook_Chapter_5;

import java.util.Scanner;
public class zyBook_5_3_1 {
    /**
     Computes the area of a triangle
     @param x1 the x-coordinate of the first corner
     @param y1 the y-coordinate of the first corner
     @param x2 the x-coordinate of the second corner
     @param y2 the y-coordinate of the second corner
     @param x3 the x-coordinate of the third corner
     @param y3 the y-coordinate of the third corner
     @return the area of the triangle
     */
    public static double triangleArea(double x1, double y1, double x2, double y2, double x3, double y3)
    {
        /* Your code goes here */
        double top;
        double button = 2;

        double first = x1 * (y2 - y3);
        double second = x2 * (y3 - y1);
        double third = x3 * (y1 - y2);
        double sum = first + second + third;
        top = Math.abs(sum);

        double area = top / button;
        return area;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        double x3 = in.nextDouble();
        double y3 = in.nextDouble();
        System.out.println(triangleArea(x1, y1, x2, y2, x3, y3));
    }
}
