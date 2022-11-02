package Day18_ArraysUtil;

import java.util.Arrays;

public class Topic3_ArraysEqual {

    public static void main(String[] args) {
        int [] nums = {9,8,7,3,4,5};
        int [] nums1 = {9,8,7,3,4,5};


        System.out.println("Is nums and numns1 equal: "+Arrays.equals(nums,nums1));

        int [] nums2 ={3,4,5};
        int [] nums3 = {4,3,5};
        System.out.println("Is nums2 and nums3 equal: "+Arrays.equals(nums2,nums3));

        char [] ch = {'R','Y','E'};
        char [] ch1={'R','y','E'};

        System.out.println("Is ch and ch1 arrays equal: "+Arrays.equals(ch,ch1));

        int [] nums4 = {7,8,9,5,10}; // int a = 10;
        int [] nums5 = nums4;        // int b = a;
        System.out.println("The num5 values: "+Arrays.toString(nums5));

        System.out.println("is nums4 and nums5 equal: "+Arrays.equals(nums4,nums5));

    }
}
