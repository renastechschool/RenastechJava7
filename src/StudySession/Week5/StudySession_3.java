package StudySession.Week5;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class StudySession_3 {

    public static void main(String[] args) {


        /*
            for(Statement1; statement2; statement3)
            {

            }
        Statement 1 is executed (one time) before the execution of the code block.

		Statement 2 defines the condition for executing the code block.

		Statement 3 is executed (every time) after the code block has been executed.

         */


        for(int i =0; i<=10;i++)
        {
            System.out.println("Hello World");
        }

        int b =0;

        for(int a =1;a <=100; a +=3)
        {
            b += a;
        }

        System.out.println("Sum of Even numbers between 0 and 100 is" + b);

        for(int k =0; k< 10; k++)
        {
            if(k ==4)
            {
                break;
            }
            System.out.println(k);
        }

        int sumOdd = 0;

        for( int z =0; z<=100;z++)
        {
            if(z %2 ==0)
            {
                continue;
            }

                sumOdd +=z;
        }
        System.out.println("sumOdd = " + sumOdd);
/*
        boolean controlLogic = true;
        while(controlLogic)
        {

            System.out.println("Hello World");

            controlLogic = false;

        }
*/


        String beforeReverse = "Renas Tech";
        //hceTsaneR
        String afterReverse = "";
        int index2 = beforeReverse.length() -1;

        while( index2 != -1)
        {
            if(beforeReverse.charAt(index2) == ' ')
            {
                index2 -= 1;
                System.out.println(index2);
                continue;
            }

            afterReverse += beforeReverse.charAt(index2);
            System.out.println(index2);
            index2 -= 1;
            System.out.println("afterReverse = " + afterReverse);
        }


        String paragraph = "dasdsaddasdasd asdasdsaaaaaaaaa.     asdsadasdsadsadasd sadsadsadasdasdsad.";
        String sentence = "";

        for(int l =0 ; l<=paragraph.length()-1 ; l++)
        {
            if(paragraph.charAt(l) == '.')
            {
                System.out.println(sentence.trim() + ".");
                sentence = "";
                continue;
            }

            sentence += paragraph.charAt(l);

        }




    }





}
