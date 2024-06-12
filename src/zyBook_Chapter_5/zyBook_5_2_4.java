package zyBook_Chapter_5;
import java.util.Scanner;

public class zyBook_5_2_4 {

    /**
     Returns a string of asterisks of the same length as
     a given string.
     @param str a string such as "secret"
     @return a string with each character of str changed to a *,
     such as "******".
     */
    public static String hideCharacters(String str)
    {
        int strLength = str.length();
        /* Your code goes here */
        String hideCharacters = "";
        for(int i = 0; i < strLength; i++)
        {
            hideCharacters += "*";
        }
        return hideCharacters;
    }

    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        String starStr = hideCharacters(in.nextLine());
        System.out.println(starStr);
    }
}
