package Day30_Exceptions;

import java.util.Scanner;

public class Topic5_MultipleExceptionsCont {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Please enter a number");
            int ValueA = scan.nextInt();

            System.out.println("Please enter another number");
            int ValueB = scan.nextInt();

            double ValueC = ValueA / ValueB;
        }catch (ArithmeticException e){
            System.out.println("You can not divide by zero!");
        }

        int[] MyArray = {1,5,9,6};
//                       0 1 2 3
        System.out.println("Please enter an Index : ");
        int MyIndex = scan.nextInt();

        try {
            System.out.println(MyArray[MyIndex]); //This May throw an exception.
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("We dont have a value on index :"+MyIndex);
        }


        System.out.println("Rest of the code");
    }
}
