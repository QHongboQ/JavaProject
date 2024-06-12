package zyBook_Chapter_5;
import java.util.Scanner;

public class zyBook_5_10_2
{
    public static void printCubeTable(int n)
    {
        printHeader();
        printBody(n);
    }

    public static void printHeader()
    {
        printSeparator();
        printColHeadings();
        printSeparator();
    }

    public static void printBody(int n)
    {
        for (int i = 0; i < n; i++)
        {
            printRow(i + 1);
            if(i != n-1)
            {
                System.out.println();
            }
        }
        System.out.println();
        printSeparator();
    }

    public static void printRow(int n)
    {
        System.out.printf("|%4d |%10d |", n, (int) Math.pow(n, 3));
    }

    public static void printSeparator()
    {
        System.out.println("+-----+-----------+");
    }

    public static void printColHeadings()
    {
        System.out.println("|   i | i * i * i |");
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        printCubeTable(rows);
    }

}