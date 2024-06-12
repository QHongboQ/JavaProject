package zyBook_Chapter_5;

public class zyBook_5_13_2 {
    public static void main(String[] args)
    {
        int result = triangleArea(3);
        System.out.println(result);
    }
    public static int triangleArea(int len)
    {
        int area;
        if (len == 1)
        {
            area = 1;
        }
        else
        {
            area = triangleArea(len - 1);
            area = area + len;
        }
        return area;
    }
}
