package Day7_SwitchStatements;

import java.util.Scanner;

public class Topic5_Scanner {
    public static void main(String[] args) {
        // Scanner is a class in Java Lab
        // Scanner has multiple methods that can be used
        // In order to have a scanner you need to create an object from that class
        // in order to use Scanner we need to import the Class to our class.
        Scanner scan = new Scanner(System.in);
        System.out.println("Hey User enter a number: ");
        int number = scan.nextInt(); // int number = 12; // this will wait for uset to enter a int number and
                                                            // assign it to variable
        System.out.println("the value of the variable number is: "+number);

        System.out.println("hey user enter a double type number: ");
        double dnumber = scan.nextDouble();

        System.out.println("the double number is: "+dnumber);

        System.out.println("Hey user enter a byte data type number: ");
        byte bnumber = scan.nextByte();
        System.out.println("the byte number is: "+bnumber);

        System.out.println("Hey user enter a float data type number: ");
        float fnumber = scan.nextFloat();
        System.out.println("the float number is: "+fnumber);

        short snumber = scan.nextShort(); // this will wait for the user to enter a short number assign it to variable
        long lnumber =scan.nextLong(); // this will wait for the user to enter a long number assign it to variable


    }
}
