package StudySession.Week7;

import java.util.Arrays;

public class Week7_1 {

    public static void main(String[] args) {

        int[] intArray = new int[4];

        System.out.println(Arrays.toString(intArray));

        int[] intArray1 = {1,2,3,4};

        int[] intArray2 = {5,6,7,8};

        int totalLength = intArray1.length + intArray2.length;
        int[] intArray3 = new int[totalLength];

        int[] intArray33 = new int[totalLength];

        System.arraycopy(intArray1,0,intArray33,0,intArray1.length);
        System.arraycopy(intArray2,0,intArray33,intArray1.length,intArray2.length);





        for(int i =0; i<totalLength;i++)
        {

            if(i<intArray1.length)
            {
                intArray3[i] = intArray1[i];
            }
            else
            {
                intArray3[i] = intArray2[i- intArray1.length];
            }


        }

        System.out.println("*******************");
        System.out.println(Arrays.toString(intArray3));

        int[] makeAscending = {6,1,823,-12,8,12,-123,25,7,2,9};

        int a = 10;
        int b = 20;

        // Create a boolean data to control While condition
        boolean notSorted = true;

        while(notSorted)
        {

            // If our "if" condition will not work, then stop to iterate over the array
            notSorted = false;
            // Iterate all over the elements
            System.out.println(Arrays.toString(makeAscending));
            for(int i=0;i< makeAscending.length -1;i++)
            {

                //During the iterations compare elements if the condition work, then swap them
                if(makeAscending[i] > makeAscending[i+1])
                {
                    int temp = makeAscending[i+1];
                    makeAscending[i+1] = makeAscending[i];
                    makeAscending[i] = temp;
                    //Trigger the while loop one more time

                    notSorted =true;
                }

            }

        }

        System.out.println("******************* Sorting **********");


        /*
          int[] makeAscending = {6,1,823,-12,8,12,-123,25,7,2,9};

          Try to find the second max element

         */
        System.out.println(makeAscending[makeAscending.length-2]);






    }

}
