package StudySession.Week9;

import java.util.Arrays;

public class Week9_2_2 {

    public static void main(String[] args) {
        /*

        Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".
			lastTwo("coding")  "codign"
			lastTwo("cat")  "cta"
			lastTwo("ab")  "ba"


         */
        Week9_2_2 lastTwoObject = new Week9_2_2();
        System.out.println("lastTwoObject.lastTwo(\"coding\") = " + lastTwoObject.lastTwo("coding"));
    }

    public String lastTwo(String input)
    {
        char[] charArray = input.toCharArray();

        System.out.println(Arrays.toString(charArray));
        char temp1 = charArray[charArray.length-2];
        char temp2 = charArray[charArray.length-1];

        charArray[charArray.length - 1]  = temp1;
        charArray[charArray.length - 2]  = temp2;
        System.out.println(Arrays.toString(charArray));

        String tempString = "";

        for(int i=0; i<charArray.length;i++)
        {
            tempString += charArray[i];
        }


        return tempString;
    }



}
