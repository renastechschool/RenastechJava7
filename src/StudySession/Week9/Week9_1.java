package StudySession.Week9;

import java.util.Scanner;

public class Week8_2 {

    public static void main(String[] args)
    {
        int myInt1 = 10;
        int myInt2 = 20;

        int myInt3 = 30;

        isSameInt(myInt1,myInt2);

        printParameters(myInt2,myInt1);
        printParameters(20,10);

    /*
         Primitive Data Type	Wrapper Class
				byte	        Byte
				short	        Short
				int	            Integer
				long	        Long
				float	        Float
				double	        Double
				boolean	        Boolean
				char	        Character
     */


        int myInt4 = 40;

        Integer NonPINT = myInt4;
        // AutoBoxing
        myInt4 = NonPINT;
        //Unboxing

        /*
         * Given two strings, append them together (known as "concatenation") and
         * return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
         *
         * conCat("abc", "cat")  "abcat"
			conCat("dog", "cat")  "dogcat"
			conCat("abc", "")  "abc"
         *
         */

        conCat("abc", "cat");
        conCat("dog", "cat");
        conCat("abc", "");

    }


    public static void conCat(String input1,String input2)
    {

        if(input1.isEmpty() || input2.isEmpty())
        {
            if(input2.isEmpty())
            {
                System.out.println(input1);
            }else
            {
                System.out.println(input2);
            }
        }else if(input1.charAt(input1.length()-1) == input2.charAt(0) )
        {
            System.out.println(input1 + input2.substring(1));
        }
        else
        {
            System.out.println(input1 + input2);
        }



    }


    public static void printParameters(int myInt1, int myInt2  )
    {

        System.out.println("myInt2 = " + myInt2);
        System.out.println("myInt1 = " + myInt1);
    }


    public static void isSameInt(int a, int b)
    {
        if(a ==b)
        {
            System.out.println("These two integers are same");
        }
        else
        {
            System.out.println("These integers are not same");
        }
    }

    public static void isSameString(String a, String b)
    {
        if(a.equals(b))
        {
            System.out.println("These two Strings are same");
        }
        else
        {
            System.out.println("These Strings are not same");
        }
    }



    }






