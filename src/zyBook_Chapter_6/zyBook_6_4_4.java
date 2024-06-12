package zyBook_Chapter_6;

/**
 * Compute the distance between the positions of the first and last zero element in the given array. For example,
 * if the array is
 * 3 0 1 0 4 9 5 0 6 your algorithm should yield 7 - 1 = 6.
 * If the array contains a single zero, return 0.
 * If it doesn't contain any zeroes, return a negative value
 */
public class zyBook_6_4_4 {
    public static int Numbers(double[] values)
    {
        int firstPos = 0;
        int lastPos = values.length - 1;
        boolean found = false;
        while (firstPos < values.length && !found)
        {
            if(values[firstPos] == 0)
            {
                while (lastPos > 0 && !found)
                {
                    if(values[lastPos] == 0)
                    {
                        found = true;
                    }else
                    {
                        lastPos--;
                    }
                }
            }else
            {
                firstPos++;
            }
        }

            return lastPos - firstPos;
    }

    public static void main(String[] args)
    {
        double[] a = { 3, 0, 1, 0, 4 };
        System.out.println(Numbers(a));
        System.out.println("Expected: 2");
        double[] b = { 0, 3, 0, 1, 0, 4 };
        System.out.println(Numbers(b));
        System.out.println("Expected: 4");
        double[] c = { 3, 0, 1, 0, 2, 3, 0, 4 };
        System.out.println(Numbers(c));
        System.out.println("Expected: 5");
        double[] d = { 0, 0, 0, 0, 0 };
        System.out.println(Numbers(d));
        System.out.println("Expected: 4");
        double[] e = { 3, 1, 4 };
        System.out.println(Numbers(e) < 0);
        System.out.println("Expected: true");
        double[] f = { };
        System.out.println(Numbers(f) < 0);
        System.out.println("Expected: true");
    }


}
