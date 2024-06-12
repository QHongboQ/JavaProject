package zyBook_Chapter_7;

// input: java Search -max 20 -i student.txt result.txt
// args.length = 5

public class zyBook_7_8_2 {
    public static void main(String[] args)
    {
        int min = -1;
        int max = -1;
        boolean insens = false;
        String in = null;
        String out = null;
        int i = 0;
        while (i < args.length)
        {
            // Take the args[i] into a variable
            String arg = args[i];

            // Check the argument is starts with -, then is a command
            if (arg.startsWith("-"))
            {
                // Check which type is the command
                String opt = arg.substring(1);
                if (opt.equals("min"))
                {
                    i++;
                    min = Integer.parseInt(args[i]);
                }
                else if (opt.equals("max"))
                {
                    i++;
                    max = Integer.parseInt(args[i]);
                }
                else if (opt.equals("i"))
                {
                    insens = true;
                }
            }
            // If is not a command, so is must be a input
            else if (in == null)
            {
                in = arg;
            }
            // If not a command, either a input, it must be a output
            else if (out == null)
            {
                out = arg;
            }
            // Continue to the next arguments
            i++;
        }
    }
}
