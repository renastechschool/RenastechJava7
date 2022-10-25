package Day14_NestedLoops;

import java.util.Scanner;

public class Topic1_DoWhileLoop {

    // do {
    // Code Block
    // }while(condition)

    public static void main(String[] args) {

        // print all the numbers from 1 to 10
        int i = 1;
        do{
            System.out.println("The number is: "+i); // This code bloc will get executed
                                                        // even if the condition in the while condition is false
            i++;
        }while(i<0);

        // write a code where user is being asked to enter a one letter String but
        // even if the string has more than 1 char print only the first char

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1 char String: ");
        String st = scan.next();

        int j = 0;
        do{
            System.out.println("The first char of the String is: "+st.charAt(j));
            j++;
        }while(j<0);


    }
}
