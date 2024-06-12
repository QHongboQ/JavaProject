package zyBook_Chapter_7;

public class zyBook_7_12_1 {
    public static class Arithmetic
    {
        /**
         Computes the value of an arithmetic expression
         @param value1 the first operand
         @param operator a string that should contain an operator + - * or /
         @param value2 the second operand
         @return the result of the operation
         */
        public static int compute(int value1, String operator, int value2)
        {
            if (operator.equals("+")) { return value1 + value2; }
            else if (operator.equals("-")) { return value1 - value2; }
            else if (operator.equals("*")) { return value1 * value2; }
            else if (operator.equals("/"))
            {
                if(value2 == 0)
                {
                    throw new IllegalArgumentException("Amount exceeds balance");
                }else
                {
                return value1 / value2;
                }
            }
            else
            {
                throw new IllegalArgumentException("Amount exceeds balance");
            }
        }
    }

    public static void main(String[] args)
    {
        call(3, "+", 4, "7");
        call(3, "-", 4, "-1");
        call(3, "*", 4, "12");
        call(3, "@", 4, "java.lang.IllegalArgumentException");
        call(13, "/", 4, "3");
        call(13, "/", 0, "java.lang.IllegalArgumentException");
    }

    public static void call(int a, String op, int b, String expected)
    {
        try
        {
            System.out.print("compute(" + a + " " + op + " " + b + "): ");
            System.out.flush();
            System.out.println(Arithmetic.compute(a, op, b));
        }
        catch (Throwable ex)
        {
            System.out.println(ex.getClass().getName());
        }
        System.out.println("Expected: " + expected + "\n");
    }
}

/* Example of catch the exception
try
{
   String filename = . . .;
   Scanner in = new Scanner(new File(filename));
   String input = in.next();
   int value = Integer.parseInt(input);
   . . .
}
catch (IOException exception)
{
   exception.printStackTrace();
}
catch (NumberFormatException exception)
{
   System.out.println(exception.getMessage());
}
 */
