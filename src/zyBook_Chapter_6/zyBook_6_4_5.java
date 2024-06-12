package zyBook_Chapter_6;
import java.util.Arrays;
// Complete this code to swap the first and last element of the given array.
// Do nothing if the array is empty.
public class zyBook_6_4_5 {
    public static void swapFirstLast(int[] values)
    {
        if(values.length != 0)
        {
            int temp;
            temp = values[0];
            values[0] = values[values.length-1];
            values[values.length-1] = temp;
        }
    }

    public static void main(String[] args)
    {
        int[] a = { 3, 1, 4 };
        swapFirstLast(a);
        System.out.println(Arrays.toString(a));
        System.out.println("Expected: [4, 1, 3]");
        int[] b = { 3, 1, 4, 1, 5, 9 };
        swapFirstLast(b);
        System.out.println(Arrays.toString(b));
        System.out.println("Expected: [9, 1, 4, 1, 5, 3]");
        int[] c = { 3, 1 };
        swapFirstLast(c);
        System.out.println(Arrays.toString(c));
        System.out.println("Expected: [1, 3]");
        int[] d = { 3 };
        swapFirstLast(d);
        System.out.println(Arrays.toString(d));
        System.out.println("Expected: [3]");
        int[] e = { };
        swapFirstLast(e);
        System.out.println(Arrays.toString(e));
        System.out.println("Expected: []");
    }
}
