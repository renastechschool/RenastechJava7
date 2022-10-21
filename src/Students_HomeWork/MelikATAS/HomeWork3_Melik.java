package Students_HomeWork.MelikATAS;

import java.util.Scanner;

public class HomeWork3_Melik {
    public static void main(String[] args) {

       /*
       14 - Write a code where user is being asked to enter a name:
        if Name Starts with "A" and ends with "L" replace "A" with "B" and print the result
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name : ");
        String name = scan.next();
       if (name.startsWith("A") && name.endsWith("L")) {
           System.out.println("The result is : "+ name.replace('A','B'));
       }else {
           System.out.println("The result is : " + name);


       }


        System.out.println("************************");
        System.out.println("************************");
        System.out.println("************************");

        /*
        15- Write a Code where user is being asked to enter a sentence
        if Sentence starts with "B" or "b" and ends with "E" or "e" also contains "A" or "a"
        replace second and fourth characters with "G"
         */

        Scanner scan2=new Scanner(System.in);
         System.out.println("Please enter a sentence : ");
        String sentence=scan2.nextLine();

        if ((sentence.startsWith("B")||sentence.startsWith("b"))&&(sentence.endsWith("E")||sentence.endsWith("e")) && (sentence.contains("a") || sentence.contains("A"))){
            String newSentence = sentence.substring(0,1) + "G" + sentence.substring(3,4) + "G" + sentence.substring(5);

            System.out.println("The new sentence is : "+newSentence);
        }







    }
}
