package Project;
import java.util.Scanner;
public class zyBook_5_18_9 {
    /**
     * If the input is 3249, the output is MMMCCXLIX
     * If the input is 72, the output is LXXII
     *
     * By
     * Hongbo Zhou
     * Pablo Ruiz
     */

    // Ask the user to the input
    public static int userInput()
    {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        while((number < 1) || (number > 3999))
        {
            System.out.print("Error number, please enter agian: ");
            number = in.nextInt();
        }
        return number;
    }

    // Get the correct String according by the input
    public static String romanDigit(int n, String one, String five, String ten)
    {
        if (n == 1) { return one; }
        if (n == 2) { return one + one; }
        if (n == 3) { return one + one + one; }
        if (n == 4) { return one + five; }
        if (n == 5) { return five; }
        if (n == 6) { return five + one; }
        if (n == 7) { return five + one + one; }
        if (n == 8) { return five + one + one + one; }
        if (n == 9) { return one + ten; }
        if (n == 10) {return ten;}
        return "";
    }

    // Get every digit of the user input and pass them to the String function
    public static String romanString(int number)
    {
        String romanString = "";
        if (number >= 1000)
        {
            String romanThousands = romanDigit(number / 1000, "M", "", "");
            number = number % 1000;
            romanString += romanThousands;
        }

        if (number >= 100)
        {
            String romanHundreds = romanDigit(number / 100, "C", "D", "M");
            number = number % 100;
            romanString += romanHundreds;
        }
        if (number >= 10)
        {
            String romanTens = romanDigit(number / 10, "X", "L", "C" );
            number = number % 10;
            romanString += romanTens;
        }
        if(number >= 0)
        {
            String romanOnes = romanDigit(number, "I", "V", "X" );
            romanString += romanOnes;
        }

        return romanString;
    }

    // The main body of the code
    public static void main(String[] args)
    {
        System.out.print("Please enter a positive integer number( 0 < x < 3,999): ");
        int number = userInput();
        String romanNumber = romanString(number);
        System.out.println("The roman number of your input is: " + romanNumber);

    }
}

