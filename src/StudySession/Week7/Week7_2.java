package StudySession.Week7;

import java.util.Arrays;

public class Week7_2 {
    public static void main(String[] args) {

        String[][] testData = {{"taylantonka@gmail.com","1234"},{"renas@tech.com","5678"}};


        //find the max number of the array
        int[][] myNumbers = {{-1,-5,-9,-8},{-2,-3,-19,-87}};

        int maxNumber = myNumbers[0][0];
        //int maxNumber =0;
        for(int i =0; i<myNumbers.length;i++)
        {
            for(int j=0;j<myNumbers[i].length;j++)
            {
                if(myNumbers[i][j]>maxNumber)
                {
                    maxNumber = myNumbers[i][j];
                }
            }
        }

        System.out.println("maxNumber = " + maxNumber);

        int[][] myNumbers2 = {{5,8,2,6},{4,2,1}};
        int lengthForOneDimension = 0;


        for(int i=0; i<myNumbers2.length;i++)
        {
            lengthForOneDimension += myNumbers2[i].length;


        }
        int[] oneDimensiononeDimension = new int[lengthForOneDimension];
        String allElements ="";


        for(int i=0; i<myNumbers2.length;i++)
        {
            for(int j=0;j<myNumbers2[i].length;j++)
            {
                allElements += myNumbers2[i][j]+",";
            }
        }

        System.out.println("allElements = " + allElements);
        String[] StringOneDimension = allElements.split(",");
        System.out.println("StringOneDimension = " + Arrays.toString(StringOneDimension));
        int count = 0;
        for(String element : StringOneDimension)
        {
            oneDimensiononeDimension[count] = Integer.parseInt(element);

            count++;
        }

        System.out.println(Arrays.toString(oneDimensiononeDimension));

        //If the length is odd then return center element of the array or if the length is even then return the average of center elements
        int[] example = {5,1,61,72,11,8,9,1};

        if(example.length % 2 != 0)
        {
            System.out.println(example[example.length/2]);
        }
        else
        {
            System.out.println((example[example.length/2 -1] +  example[example.length/2 ])  /2 );
        }






    }

}
