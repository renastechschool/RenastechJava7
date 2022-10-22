package Day13_WhileLoop;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Topic2_WhileCont {

    // write a code where user is being asked to enter 2 numbers and sum all the numbers
    // in between those two numbers which can be divided by 5

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int num1 = scan.nextInt();
        System.out.println("please enter the second number: ");
        int num2 = scan.nextInt();
        int i;
        int j;
        if(num1>num2){
            i = num2;
            j = num1;
        }else{
            i = num1;
            j = num2;
        }
        int sum = 0;
        while(i<j){


            if(i%5==0){
                sum+=i; // sum = 0+13 ==> sum = 13+14 == 27+15+ ...

            }
            System.out.println("the i value "+i);
            i++;


        }
        System.out.println("the value of the sum is: "+sum);
    }
}
