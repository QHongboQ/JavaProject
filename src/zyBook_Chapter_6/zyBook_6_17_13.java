package zyBook_Chapter_6;
import java.util.ArrayList;

public class zyBook_6_17_13
{
    public static void main(String[] args)
    {
        ArrayList<Integer> primes = new ArrayList<>();
        primes.add(2);
        primes.add(3);
        primes.add(5);
        primes.add(7);
        primes.add(11);

        for (int i = primes.size() - 1; i >= 0; i--)
        {
            System.out.print(primes.get(i) + " ");
        }

        System.out.println();
    }
}