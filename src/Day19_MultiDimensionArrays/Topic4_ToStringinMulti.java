package Day19_MultiDimensionArrays;

import java.util.Arrays;

public class Topic4_ToStringinMulti {

    public static void main(String[] args) {

        int [] nums = {9,4,5,6,3,2,4,5,6,7,3,23,2,3,2};
        System.out.println("The nums arrays is: "+ Arrays.toString(nums));

        int [][] multiD = {{3,4,5,2,1,5,6,7,8,9}, {87,90,322,56}, {34,2,3,4,4,4,4,4,4,4}};
        for (int i = 0; i < multiD.length; i++) {

            System.out.println("The values: "+Arrays.toString(multiD[i]));

        }

        int [][] multi = {{300,42,53,23,14,5,6,75,8,9}, {87,90,322,56}, {34,2,3,4,4,4,409,4,403,4}};

        System.out.println("The multi array values: "+Arrays.deepToString(multi));
        // Arrays.deepToString(multidimensional Arrays) is used to convert the multi arrays to string



    }
}
