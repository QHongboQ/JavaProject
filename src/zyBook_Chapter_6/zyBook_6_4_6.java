package zyBook_Chapter_6;
import java.util.Arrays;
//Complete the following code to make a copy of the first half of an array of strings.
public class zyBook_6_4_6
{
    /**
     Copies the first half of an array. If the length is odd,
     don't copy the middle value.
     @param values an array
     @return a copy of the first half of values
     */
    public static String[] copyHalf(String[] values)
    {
        /* Your code goes here */
        int length = values.length / 2;
        return Arrays.copyOf(values, length);

    }

    public static void main(String[] args)
    {
        String[] arr1 = { "Mary", "had", "a", "little", "lamb" };
        System.out.println("Full Array 1: " + Arrays.toString(arr1));
        System.out.println("Half Array 1: " + Arrays.toString(copyHalf(arr1)));

        System.out.println();

        String[] arr2 = { "its", "fleece", "was", "white", "as", "snow" };
        System.out.println("Full Array 2: " + Arrays.toString(arr2));
        System.out.println("Half Array 2: " + Arrays.toString(copyHalf(arr2)));
    }
}