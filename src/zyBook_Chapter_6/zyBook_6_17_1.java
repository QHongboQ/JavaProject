package zyBook_Chapter_6;
import java.util.ArrayList;

public class zyBook_6_17_1 {
    /*
    Definition of array list: A Java class that implements a dynamically resizable array of objects
    Definition of generic class: A class with one or more type parameters
    Definition of type parameter: A parameter in a generic class or method that can be replaced with an actual type
     */
    public static void main(String[] args)
    {
        ArrayList<String> vowels = new ArrayList<String>();
        /* Your code goes here */
        vowels.add("a");
        vowels.add("e");
        vowels.add("i");
        vowels.add("o");
        vowels.add("u");

        System.out.println("vowels: " + vowels);
    }
}
