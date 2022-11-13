package StudySession.Week6;

import java.util.Scanner;

public class Session6_3 {

    public static void main(String[] args) {
        /*
    Question 1
    Find the unique "AAABBBCCCDEF" -> "DEF"
     */

        String inputString = "AAABBBCCCDEF";
        String unique = "";


        for(int i =0 ; i< inputString.length();i++)
        {
            int count =0;
            for(int j =0; j< inputString.length();j++)
            {

                if(inputString.charAt(i)  == inputString.charAt(j))
                {
                    count++;
                }
            }

            if(count ==1)
            {
                unique += inputString.charAt(i);
            }



        }
        System.out.println(unique);

        //Armstrong Number
        /*
         * An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. For example, 371, 1634
        for example
        *
        * 371 - > (3 * 3 *3) + (7 *7*7) + (1*1*1) = 371

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your number to check is it Armstrong");
        int armstrongInput  = scanner.nextInt();
        String convertToString = String.valueOf(armstrongInput);
        int temp = 0;
        //371
        for(int i =0; i< convertToString.length();i++)
        {
            temp += Math.pow(Integer.parseInt(convertToString.charAt(i) +""),convertToString.length());

        }

        if(armstrongInput == temp)
        {
            System.out.println(armstrongInput + " is armstrong number");
        }
        else
        {
            System.out.println("temp = " + temp);
            System.out.println(armstrongInput + " is not armstrong number");
        }











    }





}
