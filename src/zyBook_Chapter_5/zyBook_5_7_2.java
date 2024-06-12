package zyBook_Chapter_5;
import java.util.Scanner;
public class zyBook_5_7_2 {
    public static void shout(String input)
    {
        System.out.println(input + "!!!");
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        String input2 = in.nextLine();

        /* Your code goes here */
        shout(input1);
        shout(input2);

    }
}
