package Day19_MultiDimensionArrays;

public class Topic1_MultiDimensionArrays {

    public static void main(String[] args) {
        // multidimensional arrays are basically array inside of array

        // names = {{"Ziya","John","Eloise"}, {"Anil","Rami"}}

        int [][] numbers = { {3,4,5,6,7,8},      {8,7,3,4,1,0,-123},       {90,23,145,109,107}};

        /////                   index 0                index 1                  index 2

        int a = numbers[0][1];
        System.out.println("number a is: " +a);

        System.out.println("the number is: "+numbers[1][6]);

        System.out.println("The number 2 is: " +numbers[2][3]);

        int len = numbers.length;
        System.out.println("The length of outer Array is: "+len);

        System.out.println("The numbers array is: "+numbers[2]);
    }
}
