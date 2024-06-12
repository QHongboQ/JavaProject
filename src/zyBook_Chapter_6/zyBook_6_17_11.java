package zyBook_Chapter_6;
import java.util.ArrayList;

public class zyBook_6_17_11 {

    public static class ArrayListUtil
    {
        /**
         Computes the maximum value of a nonempty array list.
         @param values a non-empty array list
         @return the largest value in the array list
         */
        public static double maximum(ArrayList<Double> values)
        {
            // Compute the largest value, using an enhanced for loop
            double largest = values.get(0);
            /* Your code goes here */
            for (int i = 0; i < values.size(); i++)
            {
                if(largest < values.get(i))
                {
                    largest = values.get(i);
                }
            }
            return largest;
        }
    }

    public static void main(String[] args)
    {
        ArrayList<Double> prices = new ArrayList<Double>();
        prices.add(19.95);
        prices.add(29.95);
        prices.add(9.95);
        prices.add(9.95);
        prices.add(13.95);
        double largest = ArrayListUtil.maximum(prices);
        System.out.println(largest);
        System.out.println("Expected: 29.95");

        ArrayList<Double> temperatures = new ArrayList<Double>();
        temperatures.add(-15.0);
        temperatures.add(-5.5);
        temperatures.add(-1.9);
        temperatures.add(-4.2);
        temperatures.add(-11.9);
        largest = ArrayListUtil.maximum(temperatures);
        System.out.println(largest);
        System.out.println("Expected: -1.9");
    }
}
