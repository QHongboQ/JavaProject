package zyBook_Chapter_6;
import java.util.ArrayList;

public class zyBook_6_17_12 {

    public static class ArrayListUtil
    {
        /**
         Finds the positions of all strings equal to a given string
         in an array list of strings.
         @param words an array list of strings
         @param searchedWord the word to search for
         @return an array list of all matching positions
         */

        public static ArrayList<Integer> findAll(ArrayList<String> words, String searchedWord)
        {
            /* Your code goes here */
            ArrayList<Integer> index = new ArrayList<Integer>();
            for (int i = 0; i < words.size(); i++)
            {
                if(words.get(i).equals(searchedWord))
                {
                    index.add(i);
                }
            }
            return index;
        }

    }

    public static void main(String[] args)
    {
        ArrayList<String> words = new ArrayList<String>();
        words.add("how");
        words.add("much");
        words.add("wood");
        words.add("would");
        words.add("a");
        words.add("wood");
        words.add("chuck");
        words.add("chuck");
        words.add("if");
        words.add("a");
        words.add("wood");
        words.add("chuck");
        words.add("could");
        words.add("chuck");
        words.add("wood");
        System.out.println(ArrayListUtil.findAll(words, "wood"));
        System.out.println("Expected: [2, 5, 10, 14]");
        System.out.println(ArrayListUtil.findAll(words, "a"));
        System.out.println("Expected: [4, 9]");
        System.out.println(ArrayListUtil.findAll(words, "the"));
        System.out.println("Expected: []");
    }
}
