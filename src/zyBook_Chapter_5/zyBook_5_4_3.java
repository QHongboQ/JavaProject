package zyBook_Chapter_5;
import java.util.Scanner;

public class zyBook_5_4_3 {
    /**
     * Return true when a number is even.
     * @param n the number to check
     * @return true if n is even.
     */
    public static boolean isEven(int n)
    {
        boolean result;
        if (n % 2 == 0)
        {
            result = true;
        }
        else
        {
            result = false;
        }
        return result;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isEven(n));
    }
}
