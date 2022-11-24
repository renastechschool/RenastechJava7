package Day29_InterviewPractice;

import java.util.Arrays;

public class Q3 {

    // Two Number Sum Problem Statement
    // Given an array of integers, return the indices of the two numbers whose sum is equal to a given target.

    // input  [12,17,21,25], 29
    // output [0,1]
    public static void main(String[] args) {

        int[] newArray = new int[] {12,17,21,25};
        int target = 38;

        System.out.println(Arrays.toString(twoSum(newArray,target)));
    }

    // ask question
    // explain your way before start coding
    // talking and explaining during coding

    public static int[] twoSum(int[] input, int target){

        for (int i=0; i< input.length; i++){ // [12,17,21,25]

            int first = input[i]; // 12

            for (int j=i+1; j< input.length; j++){ // [17,21,25]
                int second = input[j]; // 17

                if((first+second) == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
