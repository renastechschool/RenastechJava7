package Day20_Methods;

import java.util.Arrays;

public class Topic3_ForEachLoop {



    public static void main(String[] args) {
        // Print each value in the given 2 dimensional array of int;


        int [][] numbers2d={{45653,678,1234,5432,453,12,34},{322,23,45,32,67,89,07,23},{90,231,22,11,145},{12,78,54,32}};

        for(int [] array :numbers2d){

            System.out.println("For the array : "+ Arrays.toString(array));
            System.out.println("The values are: ");
            for(int number:array){
                System.out.print(number+" ");

            }
            System.out.println();




        }
    }



}
