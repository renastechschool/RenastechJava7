package StudySession.Week11;

public class InterviewPractice {

    //Write a method where it takes 2 integer arrays as parameters, and returns to the integer array where it includes
// 2 highest different values in the first array and 2 lowest different values in the second array.

    public static void main(String[] args) {
        int[] array1 = {5,10,-3,97,29,11};
        int[] array2 = {123,6,1,-14,15,78};

        printMinsMaxs(array1,array2);



    }

    public static void printMinsMaxs(int[] array1, int[] array2)
    {
        int[] array3 = sortArray(array1);
        int[] array4 = sortArray(array2);

        System.out.println("Max of array1 are " + array3[0] +"and " + array3[1]);
        System.out.println("Max of array1 are " + array3[array3.length-1] +"and " + array3[array3.length-2]);


    }


    public static int[] sortArray(int[] array)
    {

        int[] array2 = array;
        boolean isSorted = false;


        while (!isSorted)
        {
            isSorted = true;

            for(int i =0; i< array.length-1;i++)
            {
                if(array2[i]<array2[i+1])
                {
                    int temp = array[i];
                    array2[i] = array2[i+1];
                    array2[i+1] = temp;
                    isSorted = false;

                }


            }

        }


        return array2;
    }





}
