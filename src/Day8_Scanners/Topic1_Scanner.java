package Day8_Scanners;

import java.util.Scanner;


public class Topic1_Scanner {

    public static void main(String[] args) {
        // next() == > It will read a word from the console
        // Java Class
        // nextLine() ==> It reads the whole line on the console.
        // Java Class

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter you first name: ");
        String firstName = scan.next();
        System.out.println("your firstname is: "+firstName);
        System.out.println("please enter your age: ");
        String age = scan.next();
        System.out.println("your age is: "+age);
        System.out.println("please enter your zipcode: ");
        String zipcode = scan.next();
        String zipcodeAge = age+zipcode;
        System.out.println("the age + Zipcode: "+zipcodeAge);


    }
}
