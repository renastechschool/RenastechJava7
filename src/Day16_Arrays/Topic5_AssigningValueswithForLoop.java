package Day16_Arrays;

public class Topic5_AssigningValueswithForLoop {


    public static void main(String[] args) {
        // write a code where you define an integer array with size/length of 10 and assign each index with
        // even numbers starting from 90
        // 90, 92, 94,96,98,100,102,104,106,108

        // arr = { 90, 92, 94,96,98,100,102,104,106,108}

        int [] arr1 = new int[10];// {0,0,0,0,0,...}

        int start = 90;

        for (int i = 0; i < arr1.length;i++ ) {

            arr1[i]= start; // {90,92,94,96,98....}
            start = start +2;

        }

        for (int i = 0; i < arr1.length; i++) {

            System.out.println("the value in index: "+i+ " is: "+arr1[i]);

        }

    }
}
