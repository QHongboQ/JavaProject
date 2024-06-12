package zyBook_Chapter_6;
import java.util.Arrays;
//Using a for loop, fill the array a with 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2, 0, 1, 2. Complete the code below.
public class zyBook_6_4_1
{
    public static void main(String[] args)
    {
        int[] a = new int[18];

        for (int i = 0; i < a.length; i++)
        {
            a[i] = i % 3;
        }

        System.out.println(Arrays.toString(a));
    }
}
