package zyBook_Chapter_6;

import java.util.Arrays;
import java.util.Scanner;

public class zyBook_6_9_5
{
    public static void main (String [] args)
    {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int values[] = new int[length];
        for (int i = 0; i < values.length; i++)
        {
            values[i] = in.nextInt();
        }
        /* Update the algorithm below */

        for (int i = 0; i < values.length; i++)
        {
            if(values[i] > 0)
            {
                if (i > 0)
                {
                    System.out.print(", ");
                }
                if(values[i] > 0)
                {
                    System.out.print(values[i]);
                }
            }
        }

    }
}