package Day17_ArraysCont;

import java.util.Arrays;

public class Topic4_ArraysSort {

    public static void main(String[] args) {

        int [] nums = {56,32,34,90,-345,-12,-34};

        System.out.println("The nums array is: "+Arrays.toString(nums));

       Arrays.sort(nums); // Arrays,sort(the name of array) will put the element in increasing order and assign back to
                            // the original array

        System.out.println("The nums array now is: "+Arrays.toString(nums));
        System.out.println("The first element in nums: "+nums[0]);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++=");

        String [] names = {"Zeliha","Eloise","Hrakar","Amer"};
        System.out.println("the Array of names is : "+Arrays.toString(names));

        Arrays.sort(names);
        System.out.println("the Array of names now : "+Arrays.toString(names));
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++=");



        // How to do decreasing order
        int [] nums3 = {90,34,-123,-456,23,1234,5673};

        int [] reverse = new int[nums.length];

        Arrays.sort(nums3); //{-456,-123,23,34,90,1234,5673}


        int j = 0;

        for (int i = nums3.length-1; i >= 0; i--) {

            reverse[j] = nums3[i]; // reverse[0] = nums3[6] {5673,0,0,0,..}
            j++;                    // reverse[1] = nums3[5] {5673,1234,....}
        }

        System.out.println("the reverse is: "+Arrays.toString(reverse));





    }
}
