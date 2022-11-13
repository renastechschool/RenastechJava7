package StudySession.Week8;

public class Week8_1 {

     //static String input = "BIBOBOBPIPDUD";

   static int value = 10;

    public static void main(String[] args) {

        String returnedValue = helloWorld(2);
        // String returnedValue = "Hello";


        System.out.println(returnedValue);

        //Reverse String
        // Renastech -> hcetsaneR
        System.out.println("************");
        System.out.println(reverseString("Renastech"));


        /*
        //Question 3
		//Write a code where user is being asked to enter a word,
		//find home many 3 character palindrome substrings are
		in the given Word and print each one of them
		//( example : Word :  "BIBOBOBPIPDUD" :
		 BIB , BOB, OBO, BOB, PIP, DUD" there are 6 Palindrome three Char substring)
         */
        calculatePalindrome();

        System.out.println("************");
        System.out.println(value);
        reduceNumber();

        System.out.println(value);
        reduceNumber();
        System.out.println("value = " + value);
        // System.out.println(reduceNumber());
        // System.out.println("asd");



    }

    public static void hi()
    {
        System.out.println("Hello Nawras");
    }

    public static void reduceNumber()
    {
        value -= 2;

    }

    public static void calculatePalindrome()
    {
        String input = "BIBOBOBPIPDUD";
        int count =0;
        for(int i = 0; i< input.length() -2;i++ )
        {
            String temp = input.substring(i, i+3);

            if(temp.equals(reverseString(temp)))
            {
                count++;
            }


        }
        helloWorld();
        System.out.println("Palindrome count is: " + count);

    }



    public static void helloWorld()
    {
        System.out.println("Hello World from void method");
    }

    public static String reverseString(String string)
    {


        String temp = "";
       /* if(true)
        {
            return "Hello";
        }
*/
        for(int i = string.length()-1;i>=0;i--)
        {
            temp += string.charAt(i);
        }


        System.out.println(temp);
        System.out.println("*********");
        return temp;
    }


    public static String helloWorld(int param1)
    {

        if(param1 %2 ==0)
        {
            return "Hello";
        }
        else
        {
            return "World";

        }




    }



}
