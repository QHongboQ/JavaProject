package zyBook_Chapter_6;
import java.util.ArrayList;

public class zyBook_6_17_9 {

    public static class Strings
    {
        public static void swapFirstLast(ArrayList<String> names)
        {
            if(!names.isEmpty())
            {
            String temp = names.getFirst();
            names.set(0, names.getLast());
            names.set(names.size() - 1, temp);
            }
        }
    }

    public static void main(String[] args)
    {
        ArrayList<String> a = new ArrayList<String>();
        a.add("Peter");
        a.add("Paul");
        a.add("Mary");
        Strings.swapFirstLast(a);
        System.out.println(a);
        System.out.println("Expected: [Mary, Paul, Peter]");
        a.add("Fred");
        Strings.swapFirstLast(a);
        System.out.println(a);
        System.out.println("Expected: [Fred, Paul, Peter, Mary]");
        ArrayList<String> b = new ArrayList<String>();
        Strings.swapFirstLast(b);
        System.out.println(b);
        System.out.println("Expected: []");
        b.add("Mary");
        Strings.swapFirstLast(b);
        System.out.println(b);
        System.out.println("Expected: [Mary]");
    }
}
