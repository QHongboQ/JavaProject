package zyBook_Chapter_6;
import java.util.ArrayList;

public class zyBook_6_17_7 {

    public static class Numbers
    {
        public static ArrayList<Integer> negativePositions(ArrayList<Double> values)
        {

            ArrayList<Integer> result = new ArrayList<Integer>();
            /* Your code goes here */
            for(int i = 0; i < values.size(); i++)
            {
                if(values.get(i) < 0)
                {
                    result.add(i);
                }
            }

            return result;
        }
    }

    public static void main(String[] args)
    {
        ArrayList<Double> a = new ArrayList<Double>();
        System.out.println(Numbers.negativePositions(a));
        System.out.println("Expected: []");
        a.add(3.9);
        a.add(-1.4);
        a.add(2.0);
        System.out.println(Numbers.negativePositions(a));
        System.out.println("Expected: [1]");
        a.add(-2.0);
        a.add(0.0);
        System.out.println(Numbers.negativePositions(a));
        System.out.println("Expected: [1, 3]");
    }
}
