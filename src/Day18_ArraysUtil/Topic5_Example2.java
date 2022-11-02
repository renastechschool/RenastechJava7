package Day18_ArraysUtil;

import java.util.Scanner;

public class Topic5_Example2 {

    public static void main(String[] args) {

        // Write a code where user id being asked to enter a Sentence
        // check for each word to see how many 4 char substring in the word is palindrome

        // " This Afternoon I found RRRRTESTdaad something that had  DIID on it."

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a sentence: ");
        String sentence = scan.nextLine();

        String [] words = sentence.split(" "); //words = {"This","Afternoon","I"....}

        for (int i = 0; i < words.length; i++) {
            int count = 0;
            String word = words[i];

            if(word.length()<4){
                continue;
            }
            for (int j = 0; j < word.length()-3; j++) {

                String sub = word.substring(j,j+4); // (0,4) subString(4,9)
                String reverse="";
                for (int k = sub.length()-1; k >=0 ; k--) {
                    char c = sub.charAt(k);

                    reverse = reverse+c;

                }

                if(sub.equals(reverse)){

                    count++;

                }


            }
            System.out.println("The word:"+word+" has "+count+" Polindrome 4 char substring");

        }


    }

}
