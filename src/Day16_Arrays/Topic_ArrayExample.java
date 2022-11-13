package Day16_Arrays;

public class Topic_ArrayExample {

    public static void main(String[] args) {
        // write a code where you find the maximum number in the given array below:
        // arr = {56,23,1,90,31,54,67,81,100,24}

        int [] arr = {56,23,1,90,31,54,67,81,100,24,89999}; // {-12,-45,-21}

        int max = arr[0];
        //int max = Integer.MIN_VALUE; // this also will work

        for (int i = 1; i < arr.length; i++) {

            if(max<arr[i]){
                max = arr[i]; // this wont get executed if condition is false
            }

        }
        System.out.println("the Max value is: "+max);


        // find the minimum number
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if(min>arr[i]){
                min=arr[i];
            }

        }
        System.out.println("the min value is: "+min);

    }
}
