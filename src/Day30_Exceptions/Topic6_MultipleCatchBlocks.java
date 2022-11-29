package Day30_Exceptions;

import java.util.Scanner;

public class Topic6_MultipleCatchBlocks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Please enter a number : ");
            int Value = scan.nextInt();

            double MyDouble = 10 / Value;

            int [] MyArray = {1,2,3,6,5,4};

            System.out.println("Please enter an Index : ");
            int AnIndex = scan.nextInt();
            System.out.println(MyArray[AnIndex]);
        }catch (ArrayIndexOutOfBoundsException MyError){
            System.out.println("We don't have a value at given index");
        }catch (ArithmeticException e){
            System.out.println("You can not divide by zero");
        }

        /*
        try{
        }
        catch{
        }
        catch{
        }
         */

    }
}
