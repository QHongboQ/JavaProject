package zyBook_Chapter_5;
import java.util.Scanner;

public class zyBook_5_7_3
{
    /**
     * Prints a line of hyphens followed by a newline.
     * @param count the number of - characters to print.
     */

    public static void printline(int n)
    {
        for(int i = 0; i < n + 4; i++)
        {
            System.out.print("-");
        }
        System.out.println();
    }

    /**
     Prints a string in a box.
     @param contents the string to enclose in a box
     */
    public static void boxString(String contents)
    {
        int n = contents.length();
        printline(n);
        System.out.println("! " + contents + " !");
        printline(n);

    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String message = in.nextLine();
        boxString(message);
    }
}