package zyBook_Chapter_6;
import java.util.Scanner;
import java.util.Arrays;

public class zyBook_6_6 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int searchedNumber = in.nextInt();
        int[] values = {1, 9, 3,4, 5, 3, 7, 19,32,51,23,534, 23};
        Arrays.sort(values);
        boolean found = false;
        int low = 0;
        int high = values.length - 1;
        int pos = 0;

        while ((low <= high) && (!found))
        {
            pos = (low + high) / 2; // Midpoint of the subsequence
            if (values[pos] == searchedNumber) { found = true; }
            else if (values[pos] < searchedNumber) { low = pos + 1; } // Look in second half
            else { high = pos - 1; } // Look in first half
        }
        if (found) { System.out.println("Found at position " + pos); }
        else { System.out.println("Not found. Insert before position " + pos); }
    }
    }

