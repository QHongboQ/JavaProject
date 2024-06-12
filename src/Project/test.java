package Project;

import java.util.Arrays;

public class test {
    public static void main(String[] args)
    {
        String temp = "Alice is A big A dog";
        String[] t = temp.split("A");
        for(int i = 0; i <temp.length()-2; i++)
        {
            System.out.println(t[i]);
        }
    }
}
