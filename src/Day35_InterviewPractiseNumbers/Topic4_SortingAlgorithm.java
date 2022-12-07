package Day35_InterviewPractiseNumbers;

/*
Bubble Sort
Selection Sort
Insertion Sort
 */

import java.util.Arrays;

public class Topic4_SortingAlgorithm {
    public static void main(String[] args) {
        // write a method that sort an array with Bubble Sort Algorithm

        int[] data = {-2, 45, 0, 11, -9};
        // do something
//        {-9, -2, 0, 11, 45}

        BubbleSort(data);
    }

    public static void BubbleSort(int[] param1){
        // I need the size
        int Size = param1.length;

        //loop to access each array elements
        for (int k = 0; k < Size; k++) {
        //{-2, 45, 0, 11, -9};
        //loop to compare array elements
            for (int i = 0; i < Size -1 ; i++) {
    //            if (45  > 0){
                if (param1[i]  > param1[i+1]){
                    // swap the values
                    int temp = param1[i];
                    param1[i] = param1[i+1];
                    param1[i+1] = temp;

                    /*
                    how to swap values
                    a = 5
                    b = 7
                    int temp = a;
                    a= b;
                    b= temp;
                     */

                }
            }

        }

        System.out.println(Arrays.toString(param1));
    }
}
