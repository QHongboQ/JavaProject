package zyBook_Chapter_6;
import java.nio.file.LinkPermission;
import java.util.ArrayList;
import java.util.Scanner;

public class zyBook_6_17_14 {

        public static void main(String[] args)
        {
            ArrayList<String> words = new ArrayList<String>();

            Scanner in = new Scanner(System.in);
            // Read input into words
            while (in.hasNext())
            {
                words.add(in.next());
            }

            // Reverse input
            for (int i = words.size() - 1; i >= 0; i--)
            {
                System.out.print(words.get(i) + " ");
            }
        }
}
