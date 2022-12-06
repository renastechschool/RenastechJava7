package Day34_InterviewPractiseString;

import java.util.Locale;

public class Topic2_CapitalizeTitle {
    public static void main(String[] args) {
        //jaVa iS eASy  -> Java Is Easy
        System.out.println(UsingSplit("jaVa iS eASy"));
    }

    //Solve without split

    public static String UsingSplit(String param1){
        String CapitalizedString = "";
        String[] MyWords = param1.split(" ");

        for(String Word:MyWords){
            // Word = MyWords[i];
            //jaVa iS eASy
            String FirstChar = Word.substring(0,1);
            String RemainingChar = Word.substring(1);

            FirstChar = FirstChar.toUpperCase();
            RemainingChar = RemainingChar.toLowerCase();
            // J
            // ava
            // Java
            CapitalizedString = CapitalizedString+ FirstChar + RemainingChar+" ";
//            CapitalizedString += FirstChar + RemainingChar;  <- Same as above

        }
        CapitalizedString = CapitalizedString.trim();
        return CapitalizedString;
    }
}
