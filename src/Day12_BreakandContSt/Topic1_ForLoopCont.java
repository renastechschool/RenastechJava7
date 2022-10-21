package Day12_BreakandContSt;

import java.util.Scanner;

public class Topic1_ForLoopCont {

    public static void main(String[] args) {
        // Write a code where it asks user to enter 2 different numbers and
        // sum all the even number in between those 2 numbers
        // ex. numbers 10 and 20(not included) ==> 10,12,14,16,18

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first number:");
        int num1 = scan.nextInt();
        System.out.println("Please enter the second number");
        int num2 = scan.nextInt();
        int start; // to hold the smaller number
        int end; // to hold higher number
        if(num1>num2){
            start = num2;
            end = num1;
        }else{
            start = num1;
            end = num2;
        }
        int sum = 0;
        for (int i = start; i < end; i++) {
           if(i%2==0){
               sum = sum+i; // this will add the even number to sum
           }
        }
        System.out.println("The sum of all the even numbers in between "+start+" and "+end+" is: "+sum);
    }

}
