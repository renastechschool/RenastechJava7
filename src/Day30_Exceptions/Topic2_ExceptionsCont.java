package Day30_Exceptions;

import java.util.Scanner;

public class Topic2_ExceptionsCont {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);

            System.out.println("Please enter a number");
            int ValueA = scan.nextInt();

            System.out.println("Please enter another number");
            int ValueB = scan.nextInt();

            double ValueC  = ValueA / ValueB;

        }catch (Exception MyParamName){
            System.out.println("Can't divided by Zero!");
        }

        System.out.println("Rest of the Code");

    }
}
