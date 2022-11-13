package Day19_MultiDimensionArrays;

import java.util.Arrays;

public class Topic2_MultiDimensionarraysEx {


    public static void main(String[] args) {

        String [][] names = {  {"Ziya","Seda"},        {"Sena","anil","Hrakar"},       {"Ferah","Onder","Fahrettin","Amer"}};

        // Index                    names[0]                names[1]                    names[2]
        // String [] regular = names[0] == {"Ziya","Seda"}

        // regular[1] == "Seda" === > names[0][1] == >"Seda"

        String [] regular = names[0];
        System.out.println("The value in index 1: "+regular[1]);
        System.out.println("the value in index 1: "+names[0][1]);

        // Getting the length(Size) of multidimensional arrays
        int namesLen= names.length;

        System.out.println("the length of names array: "+namesLen);

        // names[0], names[1], names[2] ==> names[index].length == to find inner array's length

        System.out.println("the length of names[0] array is: "+names[0].length);
        System.out.println("the length of names[1] array is: "+names[1].length);
        System.out.println("the length of names[2] array is: "+names[2].length);

        int [][] nums = { {1,2,3,4,5,6,2,1},   {908,3,4,5,2,3,2,1,87,4,5,6,90,7,7}};

        System.out.println("the length of nums array is; "+ nums.length);

        System.out.println("the length of nums[0]: "+nums[0].length);





    }
}
