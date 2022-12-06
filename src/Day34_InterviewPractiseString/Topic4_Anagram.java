package Day34_InterviewPractiseString;

import java.util.Arrays;

public class Topic4_Anagram {
    public static void main(String[] args) {
       // Listen - Silent
       // Players - parsley
       // Triangle - Integral
       // needs - dense
       // meat - team

        // get lowercase of them
        // sort them
        // check them
        System.out.println(UsingArraySort("Listen", "Silent"));

    }

    public static Boolean UsingArraySort(String Word1, String Word2){
        Boolean ReturnValue = false;
        // if the length is not equal they are not anagram
        if(Word1.length() != Word2.length() ){
            ReturnValue = false;
        }
        else{

            // get lowercase of them
            Word1 = Word1.toLowerCase();
            Word2 = Word2.toLowerCase();

            // sort them
            char[] Word1Array = Word1.toCharArray();  //T = 84  tab = 9
            char[] Word2Array = Word2.toCharArray();
            Arrays.sort(Word1Array);
            Arrays.sort(Word2Array);

            // check them
            ReturnValue = Arrays.equals(Word1Array, Word2Array);

        }

        return ReturnValue;
    }

        public static Boolean IsAnagramUsingStringMethods(String Word1, String Word2){
        //check the length if they are not equal, they are not anagram

            if(Word1.length() != Word2.length()){
                return false;
            }
            else{
                // Listen - Silent
                // Players - parsley
                // Triangle - Integral
                // needs - dense

                // meat - team

                for (int i = 0; i < Word1.length(); i++) {
                    char MyChar = Word1.charAt(i);

                    int positionofMyChar = Word2.indexOf(MyChar);
                    if (positionofMyChar == -1){
                        return false;
                    }
                    else {
                        Word2 = Word2.substring(0,positionofMyChar)+Word2.substring(positionofMyChar + 1);
                    }
                }
                return Word2.isEmpty();
            }


        }


}
