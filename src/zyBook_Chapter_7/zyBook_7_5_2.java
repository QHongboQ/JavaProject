package zyBook_Chapter_7;
import java.util.Scanner;
public class zyBook_7_5_2 {
    // Read a line
    //while (in.hasNextLine())
    //{
    //    String line = in.nextLine();
    //    Process line.
    //}

    // Find the first digit of this line
    //int i = 0;
    //while (!Character.isDigit(line.charAt(i))) { i++; }

    //Separate the two type data
    //String countryName = line.substring(0, i);
    //String population = line.substring(i);

    //Delete white space of start and end
    //countryName = countryName.trim();

    //Converting Strings to Numbers (only can contain the number, even not a space)
    //int populationValue = Integer.parseInt(population.trim());
    //double price = Double.parseDouble(input.trim());

    // Find from the first determine character form the position
    // line.indexOf(",", pos)
    public static void calculateScore (String line)
    {
        int total = 0;
        int end = line.indexOf(",", 0);
        String name = line.substring(0, end);
        while (end != -1)
        {
            String score;
            int start = end + 1;
            end = line.indexOf(",", start);
            if(end == -1)
            {
                score = line.substring(start);
            }
            else
            {
                score = line.substring(start, end);
            }
            score = score.trim();
            total = total + Integer.parseInt(score);

        }
        System.out.println(name + " " + total);
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine())
        {
            calculateScore(in.nextLine());
        }
    }
    // %-10s formats a left-justified string
    // The string items[i] + ":" is padded with spaces so it becomes ten characters wide.
    // System.out.printf("%-10s%10.2f", items[i] + ":", prices[i]);


    /* Read this file
    China
    1330044605
    India
    1147995898
    United States
    303824646

    while (in.hasNextLine())
    {
       String countryName = in.nextLine();
       int population = in.nextInt();
       in.nextLine();
       Process the country name and population.
    }

    Step:
    China\n1330044605\nIndia\n
    Read the first line: China\n
    1330044605\nIndia\n
    Read the first integer
    \nIndia\n
    We can't read the first line, because the first line is "", so we need read  \n first, then we can continuo
    Read the first line: \n
    India\n
    Repeat the loop
     */
}
