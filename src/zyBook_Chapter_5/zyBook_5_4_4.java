package zyBook_Chapter_5;
import java.util.Scanner;

public class zyBook_5_4_4 {
    /**
     * Return true when a number is even.
     * @param n the number to check
     * @return true when n is even.
     */
    public static boolean isEven(int n)
    {
        // if n % 2 == 0, return true, else return false
        return n % 2 == 0;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isEven(n));
    }
}
