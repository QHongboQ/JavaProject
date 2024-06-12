package zyBook_Chapter_5;
import java.util.Scanner;

public class zyBook_5_2_2 {
        /**
         Changes a name so that the last name comes first.
         If name has no spaces, it is returned without change.
         @param name a name such as "Mary Jane Lee"
         @return the reversed name, such as "Lee, Mary Jane".
         */
        public static String lastNameFirst(String name)
        {

            /* Your code goes here */
            if(!name.contains(" "))
            {
                return name;
            }else
            {
                int position = name.length() - 1;
                char letter = name.charAt(position);
                while (letter != ' ')
                {
                    position--;
                    letter = name.charAt(position);
                }
                String lastNameFirst =  name.substring(position + 1, name.length())+ ", " + name.substring(0, position);
                return lastNameFirst;
            }

        }

        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            String name = in.nextLine();
            System.out.println(lastNameFirst(name));
        }

}
