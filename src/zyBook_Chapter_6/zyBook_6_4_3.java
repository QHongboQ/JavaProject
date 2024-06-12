package zyBook_Chapter_6;

public class zyBook_6_4_3 {

    public static void sumAndAverage(double[] values){
        //Sum and Average Value
        double total = 0;
        for (double element : values)
        {
            total = total + element;
        }
        double average = 0;
        if (values.length > 0) { average = total / values.length; }
        System.out.println("The average value is: " + average + ".");
    }

    // Maximum and Minimum
    public static void MaxAndMin(double[] values){
        double largest = values[0];
        for (int i = 1; i < values.length; i++)
        {
            if (values[i] > largest)
            {
                largest = values[i];
            }
        }
        System.out.println("The largest number is:" + largest + ".");
    }

    // Element Separators
    public static void elementSeparators(double[] values){
        /*
         * Arrays.toString(values)
         * returns a string describing the contents of the array values in the form
         */
        for (int i = 0; i < values.length; i++)
        {
            if (i > 0)
            {
                System.out.print(" | ");
            }
            System.out.print(values[i]);
        }
        System.out.println();
    }

    //Linear Search
    public static void linearSearch(double[] values)
    {
        int searchedValue = 100;
        int pos = 0;
        boolean found = false;
        while (pos < values.length && !found)
        {
            if (values[pos] == searchedValue)
            {
                found = true;
            }
            else
            {
                pos++;
            }
        }
        if (found) { System.out.println("Found at position: " + pos); }
        else { System.out.println("Not found"); }
    }

    public static void main(String[] args)
    {
        double[] values = new double[]{1.2, 3.4, 5.6, 7.8};
        sumAndAverage(values);  // Sum and Average Value
        MaxAndMin(values); // Maximum and Minimum
        elementSeparators(values); // Element Separators
        linearSearch(values);   //Linear Search
    }
}
