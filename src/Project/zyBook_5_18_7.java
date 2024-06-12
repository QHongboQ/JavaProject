package Project;
import java.util.Scanner;

public class zyBook_5_18_7 {
    /**
     * If the input is base 0 and power 0, the output is 0
     * If the input is base 5 and power 5, the output is 3125
     *
     * By
     * Hongbo Zhou
     * Pablo Ruiz
     * @param ask
     * @return
     */

    // Ask to the user to enter a number
    public static int userInput(String ask)
    {
        Scanner in = new Scanner(System.in);
        System.out.print(ask);
        return in.nextInt();
    }

    // Check the user input is legible
    public static int check(int number)
    {
        while(number <0)
        {
            System.out.print("This is a error number, please enter again:");
            number = userInput(" ");
        }
        return number;
    }

    // Calculate the final result
    public static int evaluation(int base, int power)
    {
        if(power == 0)
        {
            return 1;
        }else if(power % 2 == 0)
            return (int) Math.pow(Math.pow(base, (double) power /2), 2);

        return base * evaluation(base, power - 1);
    }

    // The main body of the code
    public static void main(String[] args)
    {
        int base = userInput("Please enter a positive number which is the base 'a': ");
        base = check(base);

        int power = userInput("Please enter a positive number which is the power 'n': ");
        power = check(power);

        System.out.print(base +" power to " + power + " is: ");
        System.out.println(evaluation(base, power));



    }
}
