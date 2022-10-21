package Day11_ForLoopCont;

import java.util.Scanner;

public class Topic2_ForLoopExample {

    public static void main(String[] args) {
        // write a code where it counts all the even numbers in between 2 numbers those have been entered by user
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first number: "); // assuming first number is smaller
        int number1 = scan.nextInt();
        System.out.println("Please enter the second number:");
        int number2 = scan.nextInt();
        int cnt = 0;
        int cnt1 = 0;
        for(int j = number1; j<number2;j++){
          if(j%2==0){
              cnt++;

          }else{
              cnt1++;
          }
        }
        System.out.println("The total count of Even numbers between "+number1+" and"+number2+" is: "+cnt);
        System.out.println("The total count of Odd numbers between "+number1+" and"+number2+" is: "+cnt1);

    }
}
