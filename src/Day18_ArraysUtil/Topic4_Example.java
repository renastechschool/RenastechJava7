package Day18_ArraysUtil;

import java.util.Arrays;
import java.util.Scanner;

public class Topic4_Example {
    public static void main(String[] args) {
        /*
        Write a code  with following instructions:
        1) Ask user to enter a sentence
        2) check each word in the sentence to see how many 'l', 'a' and 'b' characters in the each word

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");// Apples are Amazing
        String str = scan.nextLine();
        String [] words = str.split(" "); // {"Apples", "are", "Amazing"}
        System.out.println("All the words in the Sentence: "+ Arrays.toString(words));



        for (int i = 0; i < words.length; i++) {

            int countA = 0;
            int countL = 0;
            int countB = 0;

            String word = words[i]; //  word = "Apple", "Are"

            char [] chars = word.toCharArray(); // {chars = {'A','p','p','l','e'}, chars= {'A','r','e'}
            for (int j = 0; j < chars.length; j++) {

                if(chars[j] == 'a' || chars[j] == 'A'){
                    countA++; // countA = countA +1;

                }else if(chars[j] == 'l' || chars[j] == 'L'){
                    countL++;
                }else if(chars[j] == 'b' || chars[j] == 'B'){
                    countB++;
                }

            }

            System.out.println("The word: "+words[i]+" has "+countA+" A in it");
            System.out.println("The word: "+words[i]+" has "+countB+" B in it");
            System.out.println("The word: "+words[i]+" has "+countL+" L in it");


        }
    }
}
