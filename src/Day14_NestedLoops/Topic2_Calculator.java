package Day14_NestedLoops;

import java.util.Scanner;

public class Topic2_Calculator {
    /*
    Write a calculator program where it will do following:
    1) User will be asked to make the decision 1 for Sum, 2 for Sub, 3 for Div, 4 for Mult,
    any other numbers to exit
    2) After user make the selection user should be asked to enter the first number
    3) after that user should be asked to enter second number
    4) Perform the calculation and print the result
    5) Perform the calculation for different entries unless user select to exit

     */
    public static void main(String[] args) {

        System.out.println("***** Welcome to Calculator***** ");

        Scanner scan = new Scanner(System.in);
        System.out.println("Please make the selection: 1 for Sum, 2 for Sub, 3 for Div, 4 for Multi any others to EXIT ");
        int selection = scan.nextInt();
        while(selection==1 || selection==2 || selection == 3 || selection == 4){

            System.out.println("Please enter the first number: ");
            double num1 = scan.nextDouble();
            System.out.println("Please enter second number: ");
            double num2 = scan.nextDouble();
            double result = 0;
            if(selection == 1){
                result = num1+num2;
            }else if(selection == 2){
                result = num1-num2;
            }else if(selection == 3){
                result = num1/num2;
            }else{
                result = num1*num2;
            }
            System.out.println("The result of the operation is: "+result);
            System.out.println("Please make the selection: 1 for Sum, 2 for Sub, 3 for Div, 4 for Multi any others to EXIT ");
            selection = scan.nextInt();



        }
        System.out.println("Thank you for using Calculator you are exited now ");


    }
}
