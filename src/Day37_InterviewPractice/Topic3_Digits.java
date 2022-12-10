package Day37_InterviewPractice;

import java.util.Scanner;

public class Topic3_Digits {
    public static void main(String[] args) {
//        15934 = 5 Digits
//        154   = 3 Digits
//        0154  = 3 Digits  <- converting your int to string and get length will not work


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int AValue = scan.nextInt();
        System.out.println(Digits(AValue));
    }

    public static int Digits(int param1){
        int HowManyDigits = 0;

        // do something to calculate how many digits we have
//        154 = 4 + 5*10 + 1*100

//        154 / 10 = 15     1 digit
//        15  / 10 = 1      2 digits
//        1   / 10 = 0;     3 digits

        while (param1 != 0){
            param1 = param1 / 10;
            HowManyDigits++;
        }

        return HowManyDigits;
    }

}
