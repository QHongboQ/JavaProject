package zyBook_Chapter_6;
import java.util.ArrayList;

public class zyBook_6_17_5 {

    public static class ArrayListUtil
    {
        /**
         Gets all strings from an array list of a given length.
         @param words an array list of strings
         @param wordLength the length of the words to get
         @return an array list with the words of length wordLength
         */

        public static ArrayList<String> wordsOfLength(ArrayList<String> words, int wordLength)
        {
            /* Your code goes here */
            ArrayList<String> wordOfLength = new ArrayList<String>();
            for(int i = 0; i < words.size(); i++)
            {
                if(words.get(i).length() == wordLength)
                {
                    wordOfLength.add(words.get(i));
                }

            }
            return wordOfLength;
        }

    }


    public static void main(String[] args)
    {
        ArrayList<String> words = new ArrayList<String>();
        words.add("Mary");
        words.add("had");
        words.add("a");
        words.add("little");
        words.add("lamb");
        words.add("its");
        words.add("fleece");
        words.add("was");
        words.add("white");
        words.add("as");
        words.add("snow");

        System.out.println(ArrayListUtil.wordsOfLength(words, 3));
        System.out.println("Expected: [had, its, was]");
        System.out.println();
        System.out.println(ArrayListUtil.wordsOfLength(words, 6));
        System.out.println("Expected: [little, fleece]");
        System.out.println();
        System.out.println(ArrayListUtil.wordsOfLength(words, 7));
        System.out.println("Expected: []");
        System.out.println();
        // Check that words hasn't been changed
        System.out.println(words);
        System.out.println("Expected: [Mary, had, a, little, lamb, its, fleece, was, white, as, snow]");
    }
}
