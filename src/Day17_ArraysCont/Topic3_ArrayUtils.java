package Day17_ArraysCont;

import java.util.Arrays;
import java.util.Scanner;

public class Topic3_ArrayUtils {

    public static void main(String[] args) {
        int [] numbers = {78,34,12,31,45};
        //Arrays.toString(numbers);
        System.out.println("All the elements in Array: "+Arrays.toString(numbers));


        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(" number: "+numbers[i]);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        String [] nms = {"Ali", "John","Rami"};

        String nms1 = Arrays.toString(nms);
        System.out.println("This is string rep of nms Array: "+nms1);



    }
}
