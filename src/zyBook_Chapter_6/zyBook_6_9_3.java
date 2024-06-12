package zyBook_Chapter_6;

import java.util.Arrays;
import java.util.Scanner;

public class zyBook_6_9_3
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int nums[] = new int[length];
        for (int i = 0; i < nums.length; i++)
        {
            nums[i] = in.nextInt();
        }
        int pos = 0;
        int neg = 0;

        /* Your code goes here */
        for (int i = 0; i < nums.length; i++)
        {
            if(nums[i] > 0) {pos++;}
            else if (nums[i] < 0) {neg++;}
        }

        System.out.printf("%s has %d positive and %d negative.%n", Arrays.toString(nums), pos, neg);
    }
}