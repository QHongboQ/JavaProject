package zyBook_Chapter_6;
import java.util.Arrays;
import java.util.ArrayList;

public class zyBook_6_17_15 {
    public static class ArrayListUtil
    {
        /**
         Removes adjacent duplicates from an array list of strings.
         @param word an array list of strings
         */
        public static void removeAdjacentDuplicates(ArrayList<String> words)
        {
            ArrayList<String> uniqueWords = new ArrayList<>();
            for (String word : words) {
                if (uniqueWords.isEmpty() || !word.equals(uniqueWords.get(uniqueWords.size() - 1))) {
                    uniqueWords.add(word);
                }
            }

            words.clear();
            words.addAll(uniqueWords);
        }
    }

    public static void main(String[] args)
    {
        ArrayList<String> words1 = new ArrayList<String>(Arrays.asList(
                "Typing a a word twice is is a common mistake".split(" ")));
        ArrayListUtil.removeAdjacentDuplicates(words1);
        System.out.println(words1);
        System.out.println("Expected: [Typing, a, word, twice, is, a, common, mistake]");
        ArrayList<String> words2 = new ArrayList<String>(Arrays.asList(
                "Typing a word three times is is is not so common".split(" ")));
        ArrayListUtil.removeAdjacentDuplicates(words2);
        System.out.println(words2);
        System.out.println("Expected: [Typing, a, word, three, times, is, not, so, common]");
    }
}
