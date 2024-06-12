package zyBook_Chapter_6;
import java.util.ArrayList;
import java.util.Scanner;

public class zyBook_6_17_4
{
    public static void main(String[] args)
    {
        ArrayList<String> words = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) words.add(in.next());

        ArrayList<String> copyOfWords = new ArrayList<String>();

        /* Use a for loop to copy the contents of words */
        for(int i = 0; i < words.size(); i++)
        {
            copyOfWords.add(words.get(i));
        }

        words.remove(0); // Shouldn't affect the copy
        System.out.println(words);
        System.out.println(copyOfWords);
    }
}