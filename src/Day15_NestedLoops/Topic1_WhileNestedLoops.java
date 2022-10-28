package Day15_NestedLoops;

public class Topic1_WhileNestedLoops {
    public static void main(String[] args) {
        /*
        while(condition){
            // Code block
            while(condition2){
                // second Code Block
            }
        }
        int min = Integer.MIN_VALUE; min value would be the minimum value that Integer can be
        int max = Integer.MAX_VALUE; max value would be the maximum value that Integer can be

         */

        int i = 0;
        //int j = 1;
        while(i<10){
            System.out.println("the value of i: "+i);
            int j = 1;
            while(j<10){
                //int j = 1;
                System.out.println("\t For each i: "+i+" value "+ " the j value: "+j);
                j++;
            }
            //System.out.println("this ");
            i++;

        }

    }
}
