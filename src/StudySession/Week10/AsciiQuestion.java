package StudySession.Week10;

public class AsciiQuestion {

    // try to find how many times we have digit char inside the string
    // "asdf51ga1hua141223" -> 9
    // try to find how many times we have upper case letter char inside the string
    // "412AB4C214gbs124df1324" -> 5

    public static void main(String[] args) {
        calculateDigitCount("asdf51ga1hua141223");

    }


    public static void calculateDigitCount(String input)
    {
        int count =0;

        for(int i =0;i<input.length();i++)
        {
          int ascii =   input.charAt(i);
          String asciiChar = String.valueOf(input.charAt(i));

            System.out.println(asciiChar +" --------- " +ascii );
          if(ascii<58 && ascii>47)
          {
              count++;
          }


        }
        System.out.println(count);

    }

}
