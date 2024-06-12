package zyBook_Chapter_6;

import java.util.Scanner;

public class zyBook_6_9_2
{
    /**
     Finds the next occurrence of an element in an array.
     @param values an array of values
     @param searchedValue the value to search for
     @param start the position at which to start the search
     @return the position of the first match at position >= start,
     or -1 if the element was not found
     */
    public static int findNext(int[] values, int searchedValue, int start)
    {
        while (start < values.length)
        {
            if(values[start] == searchedValue)
            {
                return start;
            }
            else
            {
            start++;
            }
        }
            return  -1;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int[] arr1 = { 3, 1, 4, 1, 5, 9, 2, 6 };
        System.out.println(findNext(arr1, in.nextInt(), in.nextInt()));
    }
}